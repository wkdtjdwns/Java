package chap_04;

public class _10_Break {
	public static void main(String[] args) {
		// break
		
		// 치킨 집에서 매일 20마리만 판매 (1인당 1마리만 구매 가능)
		// 손님이 50명이 대기 중
		
		// 20마리가 다 팔린 순간 반복문을 끊어야 함
		
		int max = 20;
		for (int i=1; i<=50; i++) { // 손님 수 (50명)
			System.out.println(i + "번 손님, 주문하신 치킨 나왔습니다.");
			if (i == max) {
				System.out.println("금일 재료가 모두 소진 되었습니다.");
				break; // 반복문을 탈출 함
				// break가 없으면 금일 재료가 모두 소진 되었습니다. 라고 출력한 후에도 21 ~ 50번 손님 주문하신 치킨 나왔습니다가 출력 됨	
			}
		}
		System.out.println("금일 영업을 종료합니다.");
		
		System.out.println("-----------------------------\n");
		
		int index = 1;
		while (index <= 50) {
			System.out.println(index + "번 손님, 주문하신 치킨 나왔습니다.");
			if (index == max) {
				System.out.println("금일 재료가 모두 소진 되었습니다.");
				break;
			}
			index++;
		}
		System.out.println("금일 영업을 종료합니다.");
	}
}
