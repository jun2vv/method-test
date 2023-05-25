package service;

public class ExceptionTest {
	public void test(int x) {
		try {
			int[] arr = new int[x];
			arr[0] = 100;
			arr[1] = 200;
		} catch(Exception e) {
			System.out.println("예외 발생");
		}
			
	}
	
	public void test2(String s) {
		try {
			
		int n = Integer.parseInt(s);
			System.out.println(n);
		} catch(Exception e) {
			System.out.println("숫자로 변경 불가능합니다");
		}
	}
	
	public void test3() throws Exception {
		Class.forName("java.lang.String");
	}
	
	// testcode
	public static void main(String[] args) throws Exception {
		ExceptionTest et = new ExceptionTest();
		et.test3();
		
		et.test2("구디");
		
		
		et.test(3);
		et.test(1);
	}
}
