package ch08;

public class Ex8_5v2 {

	public static void main(String[] args) {
		System.out.println(1 + " try블럭문 전");
		System.out.println(2 + " try블럭문 전");
		try {
			System.out.println(3);
			System.out.println(0 / 0); // 예외 발생!!!
			System.out.println(4); // 실행되지 않음
		} catch (RuntimeException ae) {
			ae.printStackTrace();
			System.out.println("예외 Runtime: " + ae.getMessage());
		} catch (ArithmeticException ae) { // RuntimeException이 더 상위 클래스여서 오류가 생김
			ae.printStackTrace();
			System.out.println("예외 Arithmetic: " + ae.getMessage());
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
--------
오류
*/
