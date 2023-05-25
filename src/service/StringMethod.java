package service;


import java.util.ArrayList;
import java.util.HashMap;

import vo.*;
public class StringMethod {
	
	// 3) 매개변수 : String
	// 1. 어떤값을 입력 받을 것인가? 파일이름(확장자포함)
	// 2. 어떻게 처리(구현)할 것인가? 파일이름을 입력하면 파일의 확장자만 추출하여 반환
	// 3. 어떤값을 반환 할 것인가? String
	public String stringParam(String filename) {
	
		if(filename == null || filename.equals("")) {
			return "";
		}
		// lastIndexOf : .을 기준으로 잘라서 .+1 부터 출력
		String file = filename.substring(filename.lastIndexOf("."));
	
		// 내가 만들었지만 비효율적
		/*
		 school.jpg -> jpg
		 보고서 hwp -> hwp
		 국장.영수증pdf -> pdf
		*/
		
		/*
			if (filename.endsWith("jpg")) {
				return "jpg";
			} else if (filename.endsWith("hwp")) {
				return  "hwp";
			} else if (filename.endsWith("pdf")) {
				return "pdf";
			}
			return "";
		*/
		return file;
	}
	
	
	/* 2)
	public Member m66(Member) 
	Member타입(id / pw / name / age)의 일부 속성(id,pw)을 
	입력받아 메서드 내에 정의된 정적 멤버자료구조(배열 or List)에서 동일한 데이터가 있으면 해당 데이터의 풀속성을 반환, 
	없으면 null 반환
	*/
	
	public Member m66(Member member) {
        if(member == null || member.getId() == null) {
           System.out.println("멤버 정보가 없습니다.");
           return null;
        }

		Member[] db = new Member[3];
		db[0] = new Member();
		db[0].setId("user"); db[0].setPw("1234"); 
		db[1] = new Member();
		db[1].setId("user2"); db[1].setPw("1234"); 
		db[2] = new Member();
		db[2].setId("user3"); db[2].setPw("1234"); 
		
		 for(Member m : db) {
	         if(m.getId().equals(member.getId()) && m.getPw().equals(member.getPw())) {
	            return m;
	         }
	      }
	      
		return null;
	}
	
	// 3)
	// public String[] m78(List)
	// String리스트를 입력받아 String배열로 반환

	public String[] m78(ArrayList<String> list) {
		if(list == null) {
			return null;
		} 
		
		
		int listSize = list.size();
		
		String[] arr = new String[listSize];
	    int curIdx = 0;
	    
		for(String s : list) {
			
			arr[curIdx] = s;
			curIdx++;
		}
		
		return arr;
	}
	
	
	// 4)
	// 숫자배열을 입력받아 짝수만 문자열로 변경 후 ArrayList<String>로 반환
	public ArrayList<String> m84(int[] nums) {
		if(nums == null) {
			System.out.println("숫자배열이 없습니다.");
	        return null;
		}
		
		ArrayList<String> strArr = new ArrayList<String>();
		
		for(int num : nums) {
			if(num % 2 == 0) {
				String numStr = ""+num;
				strArr.add(numStr);
			}
		}
		
		return strArr;
	}
	
	/* 5)
	   여러타입의 데이터를 입력받아 Emp, Dept타입으로 분산 저장 후 다시 Emp와 Dept를 HashMap<String, Object>에 저장후 반환
	*/
	public HashMap<String, Object> m96(int empNo, String empName, boolean retirer, int deptNo, String dname) {
		
		Emp emp = new Emp();
		emp.setEmpNo(empNo);
		emp.setEmpName(empName);
		emp.setRetirer(retirer);
		
		Dept dept = new Dept();
		dept.setDeptNo(deptNo);
		dept.setDname(dname);
		
		HashMap<String, Object> map = new HashMap<>();
		if(map == null) {
			
			return null;
		}
		
		map.put("emp", emp);
		map.put("dept", dept);

		
		
		return map;
	}
	
	
}
