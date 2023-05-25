package service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;

import vo.Emp;
import vo.Student;

//1) 리턴타입x
public class VoidMethod {
	public void voidParm() {
		// 매개변수 없음
		System.out.println("안녕하세요 구디아카데미입니다");
	}
	
	// 2)매개변수 : 기본타입(byte, short, int, long, float, double, char, boolean)
	
	public void intParam(int num) {
		if(num % 2 == 0) {
			System.out.println(num+"은 짝수입니다");
			return;
		} 
		System.out.println(num+"은 홀수입니다");
	}
	
	/*
	// 2-1) 두개의 숫자(int)를 입력받아 21을 넘기지 않으면서 21에 더 가까운 수를 반환하는 메서드
	public void int2Param(int x , int y) {
		if(x > 21 && y > 21) {
			System.out.println("없음");
		} else if (x > y) {
			System.out.println(y+"출력");
		} else if (y > x) {
			System.out.println(x+"출력");
		}
		
	}
	*/

	
	
	
	// 3)매개변수 : string
	public void stringParam(String name) {
		if(name.startsWith("김") || name.startsWith("이") || name.startsWith("박") ) {
			System.out.println("성씨가" + name.substring(0,1) + "입니다");
		} else {
			System.out.println("성씨가 김,이,박이 아닙니다.");
		}
	}
	
	
	// 4) 매개변수(참조타입) : int 배열
		public void intArrayParam(int[] arr) {
			if(arr == null || arr.length == 0) {
				System.out.println("입력 error");
				return; // 1)메서드를 종료 2)호출된 코드부분에 종료 후 반환값 남김
			}
			int max = arr[0]; // ex) 5, 7, 1, 10
			for(int i=0; i<(arr.length); i+=1) {
				if(arr[i] > max) {
					max = arr[i];
				}
			}
			System.out.println(max+" 입니다");
		}
	
	// 기본(값)타입 매개변수 vs 참조(주소)타입 매개변수
	public void valueTypeParam(int value) {
		value = 777;
		System.out.println(value +"바뀌엇다");
	}
	
	public void referTypeParam(int[] refer) {
		refer[0] = 77;
	}
	
	
	//5) 매개변수 : 배열(String 배열)
	// 1.어떤값을 입력 받을 것인가? 사람이름 배열 입력
	// 2. 어떻게 처리(구현)할 것인가? "김"씨 성의 인원을 출력 + 유효성검사
	// 3. 어떤값을 반환 할 것인가? void
	
	/* 이 코드는 입력값이 이름이면 발동안됨 아쉽
	public void strArrParam(String[] names) {
		// 유효성검사
		if(names == null || names.length == 0) {
			System.out.println("입력 error");
			return;
		}
		int cnt = 0;
		for(int i = 0; i<names.length; i++) {
			if(names[i] == "김") {
				cnt += 1;
			}
		}
		System.out.printf("전체 인원중 김씨는%d명입니다", cnt);
	}
	*/
	
	
	// 강사님이 만든 코드
	public void strArrParam(String[] names) {
	  // 전체 x명중 김씨는 y명입니다.
	  if(names == null || names.length == 0) {
	     System.out.println("입력이 없습니다.");
	     return;
	  }
	  int cnt = 0;
	  for(String s : names) {
	     if (s.startsWith("김")) {
	        cnt += 1;
	     }
	  }
	  // %d표현식을 사용하려면 printf사용 
	  System.out.printf("전체 %d명중 김씨는 %d명입니다", names.length, cnt);
	  
	}
	
	
	// 6) 매개변수 : 클래스
	// 1. 어떤값을 입력 받을 것인가? 한 학생의 정보(Vo)
	// 2. 어떻게 처리(구현)할 것인가? 학생 정보(ex 10, 김xx, 남자, 20살) 를 출력 + 유효성검사
	// 3. 어떤값을 반환 할 것인가? void
	
	public void classParam(Student student) {
		if(student == null || student.getName()==null 
			|| student.getGender() ==null) {
		     System.out.println("입력이 없습니다.");
		}
		Calendar c = Calendar.getInstance();
		int age = c.get(Calendar. YEAR) - student.getBirth();
		String name = student.getName().substring(0, 1);
		System.out.printf("학생정보( %d, %sxx, %d, %s )", student.getId(), name, age, student.getGender());
		
	}
	
	// 7) 매개변수 : 배열(클래스 배열)
	// 1. 어떤값을 입력 받을 것인가? 여러 학생의 정보(Studnet [])
	// 2. 어떻게 처리(구현)할 것인가? 남자x명, 여자x명 를 출력 + 유효성검사
	// 3. 어떤값을 반환 할 것인가? void
	public void clsArrParam(Student[] student) {
		if(student == null || student.length == 0) {
			 System.out.println("입력이 없습니다.");
			 return;
		}
		int mCnt = 0;
		int fCnt = 0;
		for(Student s : student) {
			if(s.getGender().equals("남")){
				mCnt +=1;
			} else if(s.getGender().equals("여")){
				fCnt +=1;
			}
		}
		System.out.printf("남자 %d명 여자 %d명",mCnt, fCnt);
	}
	

	// 8) 매개변수 : ArrayList
	// 1. 어떤값을 입력 받을 것인가? 여러 학생의 정보(List<Student>)
	// 2. 어떻게 처리(구현)할 것인가? 전체x명, 10대x명, 20대x명, 30대x명  를 출력 + 유효성검사
	// 3. 어떤값을 반환 할 것인가? void
	
	
	public void listParam(ArrayList<Student> list) {
		if(list == null) {
			return;
		}
		
		Calendar today = Calendar.getInstance();
	    int todayDate = today.get(Calendar.YEAR);
	    
		int totalCnt = 0;
		int cnt2 = 0;
		int cnt3 = 0;
		
		for(Student s : list) {
			int age = todayDate - s.getBirth();
			if(age % 10 == 20) {
				cnt2 += 1;
			} else if (age % 10 == 30 ) {
				cnt3 += 1;
			}
		}
		System.out.printf("20대 %d명 30대 %d명", cnt2, cnt3);
	}
	
	
	
	// 9) 매개변수 : HashMap
	// 1. 어떤값을 입력 받을 것인가? Student 1명 + Emp 1명 --> HashMap 하나를 입력
	// 2. 어떻게 처리(구현)할 것인가? 학생이름xxx이고 담당직원의 이름은 xxx입니다 를 출력 + 유효성검사
	// 3. 어떤값을 반환 할 것인가? void
	
	
	/* 직접만든것
	 	public void mapParam(HashMap<String, Object> map) {
	      
	      // 유효성겁사
	      if(map == null || map.size() == 0) {
	         return;
	      }
	      
	      // Map key를 사용하여 값을 가져온다.
	      String empName = (String)map.get("eName");
	      String stuName = (String)map.get("sName");
	      
	      System.out.printf("학생이름 %s이고 팀장직원의 이름은 %s 입니다.", empName, stuName);
	      
	   }
	*/
	
	// 강사님 버전
	public void mapParam(HashMap<String, Object> map) {
		
		if(map == null || map.size() == 0) {
			return;
		}
		
		Emp emp = (Emp)(map.get("eName"));
		Student student = (Student)(map.get("sName"));
		
		System.out.printf("학생이름 %s이고 팀장직원의 이름은 %s 입니다.", student.getName(), emp.getEmpName());
		
	}
}


