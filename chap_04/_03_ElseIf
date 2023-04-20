package chap_04;

public class _03_ElseIf {
	public static void main(String[] args) {
		/*
		 * if (조건1) {
		 * 		// 조건1이 true 일 때 실행되는 코드
		 * } else if (조건2) {
		 * 		// 조건2가 true 일 때 실행되는 코드
		 * } else if (조건3) {
		 * 		// 조건3이 true 일 때 실행되는 코드
		 * } else {
		 * 		// 조건1, 2, 3이 모두 false 일 때 실행되는 코드
		 * }
		 * 
		 * else if 는 무한대로 생성이 가능하다
		 */
		
		/* 
		 * 카페에서 주문할 때
		 * 카페라떼가 있으면 카페라떼 주문
		 * 카페라떼가 없으면 카페모카 주문
		 * 카페모카도 없으면 아메리카노 주문
		 */
		
		boolean cafelatte = true;
		boolean cafemocha = true;
		
		// 맨 위에서부터 실행하며 하나의 결과가 true이면 그 아래에 있는 조건식들은 실행하지 않는다
		if (cafelatte) {
			System.out.println("카페라떼 주문!");
		} else if (cafemocha) {
			System.out.println("카페모카 주문!");
		} else {
			System.out.println("아메리카노 주문!");
		}
		System.out.println("주문 완료 #1");
		
		// 음로 하나 추가 => else if 문을 하나 더 추가
		cafelatte = false;
		cafemocha = false;
		boolean tea = true;
		
		if (cafelatte) {
			System.out.println("카페라떼 주문!");
		} else if (cafemocha) {
			System.out.println("카페모카 주문!");
		} else if (tea) {
			System.out.println("차 주문!");
		} else {
			System.out.println("아메리카노 주문!");
		}
		System.out.println("주문 완료 #2");
		
		// else문은 상황에 따라 없을 수도 있다
		cafelatte = false;
		cafemocha = true;
		tea = false;
		
		if (cafelatte) {
			System.out.println("카페라떼 주문!");
		} else if (cafemocha) {
			System.out.println("카페모카 주문!");
		} else if (tea) {
			System.out.println("차 주문!");
		} 
		System.out.println("커피 주문 완료 #3");
	}
}
