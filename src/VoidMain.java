import java.util.ArrayList;
import java.util.HashMap;

import service.VoidMethod;
import vo.Emp;
import vo.Student;

public class VoidMain {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VoidMethod vm = new VoidMethod();
		vm.voidParm();
		
		int num = 5;
		int num2 = 10;
		
		vm.intParam(num);
		vm.intParam(num2);
		
		String name ="조리뽕";
		
		vm.stringParam(name);
		
		int x = 20;
		int y = 19;
		
		//vm.int2Param(x, y);
		
		int[] arr = {100, 1, 10, 55, 90, 99};
		vm.intArrayParam(arr);
		
		///////////////////////
		
		int value = 100;
		vm.valueTypeParam(value);
		System.out.println(value);
		
		
		int[] refer = {1, 2, 3};
		System.out.println(refer[0]);
		vm.referTypeParam(refer);
		System.out.println(refer[0]);
		
		
		
		String[] names = {"김삿갓", "최삿갓", "김삼중", "조동필", "이무기", "김치원"};
		vm.strArrParam(names);
		
		
	
		
		Student s1 = new Student();
		s1.setGender("남");
		s1.setBirth(1999);
		Student s2 = new Student();
		s2.setGender("남");
		s2.setBirth(1995);
		Student s3 = new Student();
		s3.setGender("여");
		s3.setBirth(1997);
		
		Student[] students = new Student[3];
		students[0] = s1;
		students[1] = s2;
		students[2] = s3;
		
		vm.clsArrParam(students);
		
		ArrayList<Student> list = new ArrayList<>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		vm.listParam(list);
		
		HashMap<String,Object> map = new HashMap<String,Object>();
		
		Emp e = new Emp();
		e.setEmpName("김xx");
		Student s = new Student();
		s.setId(10);
		s.setBirth(2004);
		s.setGender("여자");
		s.setName("김XX");
		vm.classParam(s);
		
		/*
		  내가 만든것
		map.put("eName", e.getEmpName());
		map.put("sName", s.getName());
		vm.mapParam(map);
		 */
		
		// 강사님 버전
		map.put("eName", e);
		map.put("sName", s);
		vm.mapParam(map);
		
		
		
	
		
	}
}
