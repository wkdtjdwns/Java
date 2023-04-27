package chap_04;

public class _01_If {
	public static void main(String[] args) {
		// 조건문 IF
		int hour = 9; // 오전 09시
		
		// 성일카페에서 오후 2시 이전에는 아메리카노를 1+1에 판매하고 10시 이전에 오면 샷 추가도 가능함
		if (hour < 14) {
			System.out.println("아메리카노 1+1");
		}
		
		/*
		 * if (조건식) {
		 * 		// 조건식의 조건이 참일 경우 실행할 코드
		 * }
		 */
		
		// if 문 내에서 하나의 문장을 실행할 때는 { } 생략 가능
		if (hour < 14) System.out.println("아메리카노 1+1 (2)");
		
		// if 문 내에서 2개 이상의 문장을 실행할 때는 { } 생략 불가
		if (hour < 10) {
			System.out.println("아메리카노 1+1");
			System.out.println("샷 추가!!");
		}
		System.out.println("================");
		
		// 오후 2시 이전, 모닝커피를 마시지 않은 경우 아메리카노 1+1
		hour = 10;
		boolean morningCoffee = false;
		if (hour < 14 && !morningCoffee) {
			// (boolean 변수명) => boolean 변수가 true이다
			// !(boolean 변수명) => boolean 변수가 false이다
			System.out.println("아메리카노 1+1");
		}
		
		// 오후 2시 이후, 모닝커피를 마신 경우 아메리카노 500원 할인
		hour = 15;
		morningCoffee = true;
		if (hour >= 14 || morningCoffee) {
			System.out.println("아메리카노 500원 할인");
		}
		
	}
}
