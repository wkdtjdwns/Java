package ch08;

public class Ex8_5 {

	public static void main(String[] args) {
		System.out.println(1 + " try블럭문 전");
		System.out.println(2 + " try블럭문 전");
		try {
			System.out.println(3);
			System.out.println(0 / 0); // 예외 발생!!!
			System.out.println(4); // 실행되지 않음
		} catch (ArithmeticException ae) {
			ae.printStackTrace(); // 참조 변수 ae를 통해 ArithmeticException 인스턴스에 접근함.
			System.out.println("예외 메시지: " + ae.getMessage());
		} // try-catch문의 끝
		
		System.out.println(6);
		// main 메서드의 끝
	}
}

/*
실행 결과
-----------------------------------------------
1 try블럭문 전
2 try블럭문 전
3
java.lang.ArithmeticException: / by zero
	at java_exec6/ch08.Ex8_5.main(Ex8_5.java:10)
예외 메시지: / by zero
6
*/
