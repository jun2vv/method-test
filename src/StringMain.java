import java.util.ArrayList;
import java.util.HashMap;

import service.StringMethod;
import vo.Dept;
import vo.Emp;
import vo.Member;

public class StringMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 메소드클래스 
		StringMethod s = new StringMethod();
		
		// 1번
		String jpg = "school.jpg";
		String hwp = "school.hwp";
		String pdf = "school.pdf";
		System.out.println("1번 -->" + s.stringParam(jpg));
		
		
		// 2번 아이디대조 예제
		Member m = new Member();
		m.setId("user");
		m.setName("루피");
		m.setAge(19);
		m.setPw("1234");
		System.out.println("2번 -->" + s.m66(m));
		
		// 3번
		ArrayList<String> stringList = new ArrayList<String>();
		stringList.add("루피");
		stringList.add("나미");
		stringList.add("조로");
		
		String[] sArr = s.m78(stringList);
		
		
		for(String item : sArr) {
			
			System.out.println("3번 -->" + item);
		}
        
        // 4번
        int[] numbers = {1, 2, 3, 4, 5, 6};
        ArrayList<String> evenNumbers = s.m84(numbers);

        System.out.println("4번 -->" + evenNumbers);
    
        
        // 5번
        HashMap<String,Object> map = s.m96(15, "구디", true, 10, "퇴사");
        
        Emp emp = (Emp)map.get("emp");
        Dept dept = (Dept)map.get("dept");
        
        System.out.printf("%s님의 부서는 %s 입니다%n", emp.getEmpNo(), dept.getDeptNo());
		
	}
	
}
