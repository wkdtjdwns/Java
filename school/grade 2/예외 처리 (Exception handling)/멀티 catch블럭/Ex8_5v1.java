package ch08;

public class Ex8_5v1 {

	public static void main(String[] args) {
		System.out.println(1 + " try블럭문 전");
		System.out.println(2 + " try블럭문 전");
		try {
			System.out.println(3);
			System.out.println(0 / 0); // 예외 발생!!!
			System.out.println(4); // 실행되지 않음
		} catch (ArithmeticException ae) {
			ae.printStackTrace();
			System.out.println("예외 Arithmetic: " + ae.getMessage());
		} catch (RuntimeException ae) {
			ae.printStackTrace();
			System.out.println("예외 Runtime: " + ae.getMessage());
		} catch (Exception ae) {
			ae.printStackTrace();
			System.out.println("예외 Exception: " + ae.getMessage());
		} // try-catch문의 끝
		System.out.println(6);
		// main 메서드의 끝
	}
}
/*
실행 결과
---------------------------------------------------
1 try블럭문 전
2 try블럭문 전
3
java.lang.ArithmeticException: / by zero
	at java_exec6/ch08.Ex8_5v1.main(Ex8_5v1.java:10)
예외 Arithmetic: / by zero
6
*/
