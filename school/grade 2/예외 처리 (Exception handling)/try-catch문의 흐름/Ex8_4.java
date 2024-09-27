package ch08;

public class Ex8_4 {

	public static void main(String[] args) {
		System.out.println(1 + " try블럭문 전");
		System.out.println(2 + " try블럭문 전");
		try {
			System.out.println(3);
			System.out.println(0 / 0);
			System.out.println(4); // 실행되지 않음
		} catch (ArithmeticException ae) {
			if (ae instanceof ArithmeticException) {
				System.out.println("true");
			}
			
			System.out.println("ArithmeticException");
		} catch (Exception e) { // 위에서 ArithmeticException를 쓰고 부모인 Exception을 아래에 사용했기 때문에 사용 가능
			System.out.println("Exception");
		} // try-catch문의 끝
		
		System.out.println(6);
		// main 메서드의 끝
	}
}

/*
실행 결과
--------------------
1 try블럭문 전
2 try블럭문 전
3
true
ArithmeticException
6
*/
