package chap_04;

public class _02_Else {
	public static void main(String[] args) {
		
		/*
		 * if (조건식) {
		 * 		// 조건식이 true 일 때 실행되는 코드
		 * } else {
		 * 		// 조건식이 false 일 때 실행되는 코드
		 * }
		 */
		
		int hour = 14;
		/* if문을 계속 만들어도 가능은 함
		 * 하지만 조건을 굳이 2번 검색하게 되면 최적화 부분에서 손해를 보게 된다
		 * 그래서 하나의 if 문으로 2개의 조건을 만들 수 있게 만들어 놓은게 else문이다
		 */ 
		if (hour < 14) {
			System.out.println("아메리카노 1+1");
		}
		
		if (hour >= 14) {
			System.out.println("카페라떼 1+1");
		}
		// 위에 있는 조건문들을 하나로 합침
		if (hour < 14) {
			System.out.println("아메리카노 1+1");
		} else {
			System.out.println("카페라떼 1+1");
		}
		// 실행되는 코드가 1개일 때는 { } 생략이 가능하다
		
		// 생략하면 이렇게 된다
		if (hour < 14) System.out.println("아메리카노 1+1");
		else System.out.println("카페라떼 1+1");
	}
}
