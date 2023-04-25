package chap_04;

public class _11_Continue {
	public static void main(String[] args) {
		// Continue
		
		// 치킨 주문 손님중에 노쇼 손님(받지 않는 손님)이 있다고 가정
		int max = 20; // 최대 치킨 판매 수량
		int sold = 0; // 현재 치킨 판매 수량
		int noShow = 17; // 대기번호 17번 손님이 노쇼
		
		for (int i=1; i<=50; i++) {
			System.out.println(i + "번 손님, 주문하신 치킨 나왔습니다.");
			
			// 손님이 없다면?
			if (i == noShow) {
				System.out.println((i + "번 손님, 자리에 계시지 않아 다름 손님이 가져갑니다."));
				continue; // 아래에 있는 모든 코드는 실행하지 않고 최상위 반복문으로 돌아감
			}
			
			sold++; // 판매 처리
			if (sold == max) {
				System.out.println("금일 재료가 모두 소진 되었습니다.");
				break;
			}
		}
		System.out.println("금일 영업을 종료합니다.");
	}
}
