package service;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;

import vo.*;

public class PrimitiveMathod {
	/*
	 
	*/
	
	// 1) 매개변수 : 없음
	// 1. 어떤값을 입력 받을 것인가? void
	// 2. 어떻게 처리(구현)할 것인가? 0 ~ int최대값 중에 하나를 리턴
	// 3. 어떤값을 반환 할 것인가? int타입
	public int voidParam() {
		// 최소값 0, 최대값 int타입의 최대값 : Integer랩퍼타입이용
		double rNum = Math.random(); //0.00000000000000000000000000~ 0.9999999999999
		long intMax = (long)Integer.MAX_VALUE + (long)1; // Max_VALUE 최대값 구하는 메서드
		int returnValue = (int)Math.floor(intMax * rNum);
		return returnValue;
	}
	
	// 2) 매개변수 : 기본타입
	// 1. 어떤값을 입력 받을 것인가? 태어난 년도
	// 2. 어떻게 처리(구현)할 것인가? 성인 true / 아니면 false
	// 3. 어떤값을 반환 할 것인가? boolean
	public boolean primitiveParam(int birth) {
		int todayYear = Calendar.getInstance().get(Calendar.YEAR);
			if(birth < 0 || birth > todayYear) {
			return false;
		}
		if(todayYear - birth > 18) {
			return true;
		}
		return false;
	}

	// 2-1) 매개변수 : 기본타입
	// 1. 어떤값을 입력 받을 것인가? int, int int값 두개
	// 2. 어떻게 처리(구현)할 것인가? 두 입력값 중 더 큰값 반환
	// 3. 어떤값을 반환 할 것인가? int
	public int primitive2Param(int x, int y) {
		if(x < y) {
			return y;
		}
		return x;
	}
	
	// 3) 매개변수 : String
	// 1. 어떤값을 입력 받을 것인가? 문자열 두개
	// 2. 어떻게 처리(구현)할 것인가? firstName과 lastName의 길이를 반환 
	// 3. 어떤값을 반환 할 것인가? int
	
	public int stringParam(String firstName, String lastName) {
		
		int fName = firstName.length();
		int lName = lastName.length();
		
		return fName + lName;
		
	}
	
	// 4) 매개변수 : 배열(기본타입 배열)
	// 1. 어떤값을 입력 받을 것인가? int[]
	// 2. 어떻게 처리(구현)할 것인가? 배열의 합 
	// 3. 어떤값을 반환 할 것인가? long
	
	public long arrayParam(int[] arr) {
		if(arr == null || arr.length == 0) {
			return 0 ;
		}
		long total = 0;
		for(int i =0; i<arr.length; i+=1) {
			total += arr[i];
		}
		return total;
	}
	
	
	// 5) 매개변수 : 배열(String 배열)
	// 1. 어떤값을 입력 받을 것인가? 이름 배열
	// 2. 어떻게 처리(구현)할 것인가? 입력된 이름 중 한명이라도 블랙리스트 명단에 있으면 true 아니면 false  
	// 3. 어떤값을 반환 할 것인가? boolean
	
	public boolean strArrParam(String[] names) {
		// 블랙리스트
		final String [] blackList = {"루피","상디","조로"};
		if(names == null || names.length == 0) {
		     System.out.println("잘못입력하셨습니다");
	         return false;
		}
		
		for(int i =0; i<names.length; i++) {
			for(int x = 0; x<blackList.length; x++) {
				if(names[i].equals(blackList[x])) {
					return true;
				}
			}
			
		}
		return false;
	}
	
	// 6) 매개변수 : 클래스
	// 1. 어떤값을 입력 받을 것인가? 학생타입의 번호, 이름, 속성만입력
	// 2. 어떻게 처리(구현)할 것인가? 로그인
	// 3. 어떤값을 반환 할 것인가? boolean
	
	public boolean clsParam(Student student) {
		Student[] db = new Student[3];
		db[0] = new Student();
		db[0].setId(100); db[0].setPw("1234");
		db[1] = new Student();
		db[1].setId(200); db[0].setPw("1234");
		db[2] = new Student();
		db[2].setId(300); db[0].setPw("1234");
		
		 for(Student s : db) {
	         if(s.getId() == student.getId() && s.getPw().equals(student.getPw())) {
	            return true;
	         }
	      }
	      return false;
	   }

	// 7) 매개변수 : 배열(클래스 배열)
	// 1. 어떤값을 입력 받을 것인가? 학생배열 Student[]
	// 2. 어떻게 처리(구현)할 것인가? 성별이 여자인분들의 나이 평균
	// 3. 어떤값을 반환 할 것인가? double
	public double clsArrParam(Student[] arr) {
		// 현재 년도
		int todayYear = Calendar.getInstance().get(Calendar.YEAR);
		int sumAge = 0;
		double avgAge = 0;
		int cnt = 0;
		for(Student s : arr) {
			if(s.getGender().equals("여")) {
				
				int age = todayYear - s.getBirth();
				sumAge += age;
				cnt++;
			}
		}
		// 자바의 반올림api는 정수부분까지 반올림하기때문에 숫자를 소수 두번째자리까지 키웠다가 반올림
		avgAge = (double)sumAge / (double)cnt;
		avgAge = Math.round(avgAge * 100) / 100;
		return avgAge;
		
	}	
		
	/*
		double fAvg = 0;
		int fSum = 0;
		Calendar today = Calendar.getInstance();

		
		for(int i =0; i<s.length; i++) {
			
			if(s[i].getGender().equals("여")) {
			fSum += s[i].getBirth() - 2023;
				
			}
			
			fAvg = fSum/s.length;
		}
		return fAvg;
	}
	*/
	
	// 8) 매개변수 : ArrayList
	// 1. 어떤값을 입력 받을 것인가? 성적 데이터 (4과목 국어, 영어, 수학, 과학)
	// ex) null이면 0+0+0+0, 국어 한과목이 80이다 나머지는 입력안됨 80+0+0+0
	// 2. 어떻게 처리(구현)할 것인가? 4과목(4과목이 안되면 0점으로 과목 추가) 평균 90이상 A, 80이상 B, 70이상 C 나머지 F
	// 3. 어떤값을 반환 할 것인가? char 'A', 'B', 'C', 'F'
	
	public char listParam(ArrayList<Subject> list) {
		
		int avg = 0;
		int sum = 0;
		int cnt = 0;
		for(Subject s : list) {
			if (s.getScore() == 0) {
				s.setScore(0);
			}
			sum += s.getScore();
			cnt++;
		}
		avg = sum / cnt;
		if(avg >= 90) {
			return 'A';
		} else if(avg >= 80) {
			return 'B';
		} else if(avg >=70) {
			return 'C';
		} 
		return 'f';
	}
	
	/* 강사님이 하신거
	public char listParam(ArrayList<Subject> list) {
	      int scoreSum = 0;
	      if(list != null) {
		      for(Subject s : list) {
		         scoreSum += s.getScore();
		      }
	      }
	      int avg = scoreSum / 4;
	      
	      if(avg >= 90) {
	         return 'A';
	      }
	      if(avg >= 80) {
	         return 'B';
	      }
	      if(avg >= 70) {
	         return 'C';
	      }
	      
	      return 'F';
	}
	*/

	// 9) 매개변수 : HashMap
	// 1. 어떤값을 입력 받을 것인가? 두개의 리스트(Student, Emp)
	// 2. 어떻게 처리(구현)할 것인가? 총인원(리스트사이즈의 합)을 계산
	// 3. 어떤값을 반환 할 것인가? int
	public int mapParam(HashMap<String, Object> map) {
		// null 유효성검사 해야함
		int studentCnt = 0;
		int empCnt = 0;
		ArrayList<Student> studentList = (ArrayList<Student>)map.get("studentList");
		ArrayList<Emp> empList = (ArrayList<Emp>)map.get("empList");
		
		studentCnt = studentList.size();
		empCnt = empList.size();
		
		return studentCnt + empCnt;
	}
	
	

	
	
}
