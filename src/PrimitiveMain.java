import java.util.ArrayList;
import java.util.HashMap;

import service.PrimitiveMathod;
import vo.Emp;
import vo.Student;
import vo.Subject;


public class PrimitiveMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrimitiveMathod pm = new PrimitiveMathod();
		
		// 1번
		int maxIntValue = pm.voidParam();
		System.out.println("1번 -->" + maxIntValue);
	
		// 2번
	      int birth = 1988;
	      boolean result = pm.primitiveParam(birth);
	      System.out.println("2번-->"+result);
	      
	    // 2-1번
	    int num1 = 10;
	    int num2 = 15;
	    int result2 = pm.primitive2Param(num1, num2);
	    System.out.println("2-1번-->"+result2);
	      
		
		// 3번
		String name = "김삿갓";
		String name2 = "김무열";
		System.out.println("3번 -->" + pm.stringParam(name, name2));
		
		// 4번
		int[] arr = {5, 5, 5, 5, 5};
		System.out.println("4번 -->" + pm.arrayParam(arr));
		
		// 5번
		String[] student = {"홍길동","임꺽정","장화","홍련","조로"};
		boolean strArrayParam = pm.strArrParam(student);
		System.out.println("5번 -->" + strArrayParam);
		
		// 6번
	    Student student1 = new Student();
	    student1.setId(100);
	    student1.setPw("2234");
	    boolean result3 = pm.clsParam(student1);
	    System.out.println("6번-->"+result3);
	    
		
		// 7번 
		Student[] studentArr = new Student[3];
		studentArr[0] = new Student();
		studentArr[0].setBirth(1999);
		studentArr[0].setGender("여");
		
		studentArr[1] = new Student();
		studentArr[1].setBirth(2002);
		studentArr[1].setGender("여");
		
		studentArr[2] = new Student();
		studentArr[2].setBirth(2000);
		studentArr[2].setGender("남");
		
		System.out.println("7번 -->" + pm.clsArrParam(studentArr));
		
		
		//8)
		ArrayList<Subject> subjectList = new ArrayList<>();
		
		Subject[] subArr = new Subject[4];
		
		subArr[0] = new Subject();
		subArr[0].setScore(100);
		subArr[0].setName("국어");
		
		subArr[1] = new Subject();
		subArr[1].setScore(90);
		subArr[1].setName("수학");
		
		subArr[2] = new Subject();
		subArr[2].setScore(90);
		subArr[2].setName("영어");
		
		subArr[3] = new Subject();
		subArr[3].setScore(90);
		subArr[3].setName("과학");
		
		for(Subject s : subArr) {
			subjectList.add(s);
		}
		
		System.out.println("8번-->평균 학점: " + pm.listParam(subjectList));
		
		/*
		Subject s1 = new Subject();
	    s1.setName("국어");
	    s1.setScore(100);
	    subjectList.add(s1);

	    Subject s2 = new Subject();
	    s2.setName("수학");
	    s2.setScore(90);
	    subjectList.add(s2);

	    Subject s3 = new Subject();
	    s3.setName("영어");
	    s3.setScore(90);
	    subjectList.add(s3);

	    Subject s4 = new Subject();
	    s4.setName("과학");
	    s4.setScore(90);
	    subjectList.add(s4);
	    
      
      	char grade = pm.listParam(subjectList);
      	System.out.println("8번-->평균 학점: " + grade);
		*/
		
		
		
		// 9번
		HashMap<String,Object> map = new HashMap<String,Object>();
		ArrayList<Student> sList = new ArrayList<Student>();
		
		Student[] sArr = new Student[3]; 
		sArr[0] = new Student();
		sArr[0].setId(100);
		sArr[1] = new Student();
		sArr[1].setId(100);
		sArr[2] = new Student();
		sArr[2].setId(100);
		// 배열은 바로 add에 담을 수 없어 for문으로 돌려 담는다.
		for(Student s : sArr) {
			sList.add(s);
		}
        
		ArrayList<Emp> eList = new ArrayList<Emp>();
		Emp e = new Emp();
		e.setEmpId(100);
		eList.add(e);
		
		
		map.put("studentList", sList);
		map.put("empList",eList);
		
		
		System.out.println(pm.mapParam(map));
		
	}
	
	
	
	
}
