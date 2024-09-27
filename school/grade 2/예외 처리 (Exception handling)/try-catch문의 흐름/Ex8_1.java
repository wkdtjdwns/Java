package ch08;

public class Ex8_1 {

	public static void main(String[] args) {
		System.out.println(1 + " try블럭문 전");
		try {
			System.out.println(2 + " try블럭문");
			System.out.println(3 + " try블럭문");
		} catch (Exception e) {
			System.out.println(4 + " catch블럭문 Exception e"); // 실행되지 않음.
		}
		
		System.out.println(5 + " try블럭문 끝~~");
	}
}

/*
실행 결과
----------------
1 try블럭문 전
2 try블럭문
3 try블럭문
5 try블럭문 끝~~
*/
