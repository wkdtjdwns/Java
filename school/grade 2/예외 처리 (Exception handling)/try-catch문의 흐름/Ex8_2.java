package ch08;

public class Ex8_2 {

	public static void main(String[] args) {
		System.out.println(1 + " try블럭문 전");
		try {
			System.out.println(0 / 0 + " try블럭문 0/0실행");
			System.out.println(2 + " try블럭문"); // 실행되지 않음
		} catch (ArithmeticException ae) {
			System.out.println(3 + " catch블럭문실행 ae");
		}
		
		System.out.println(4 + " try블럭문 End");
	}
}

/*
실행 결과
--------------------
1 try블럭문 전
3 catch블럭문실행 ae
4 try블럭문 End
*/
