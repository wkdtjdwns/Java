package chap_04;

public class _04_SwitchCase {
	public static void main(String[] args) {
		// Switch Case

		/* 석차에 따른 장학금 지급
		 * 1등 : 전액 장학금
		 * 2등 : 반액 장학금
		 * 3등 : 반액 장학금
		 * 그 외 : 장학금 대상 아님
		 */
		
		// if문 사용
		int rank = 1;
		
		if (rank == 1) {
			System.out.println("전액 장학금 지급");
		} else if (rank == 2 || rank == 3) {
			System.out.println("반액 장학금 지급");
		} else {
			System.out.println("장학금 대상 아님");
		}
		
		System.out.println("============");
		
		// 케이스가 명확한 경우 에는 switch문을 사용하는 것을 고려해볼만 하다
		
		/*
		 * switch (조건) {
		 * 		case (조건값1):
		 * 			// 조건값1가 true 일때 실행 할 코드
		 * 			break;
		 * 		case (조건값2):
		 * 			// 조건값2이 true 일때 실행 할 코드
		 * 			break;
		 * 		case (조건값3):
		 * 			조건값3가 true 일때 실행 할 코드
		 * 			break;
		 * 		default:
		 * 			조건값1,2,3 이 모두 true가 아닐 때 실행 할 코드
		 * }
		 */
	
		rank = 3;
		switch (rank) {
			case 1: 
				System.out.println("전액 장학금 지급");
				break;
			case 2:
			case 3:
				System.out.println("반액 장학금 지급");
				break;
			default:
				System.out.println("장학금 대상 아님");
		}
		
		// 상황에 따라 케이스에 break를 사용하지 않을 수 있음
		
		// 중고상품을 등급에 따라 가격을 책정 (1급 : 최상, 4급 : 최하)
		// 등급별 천원씩 차등이 있음
		int grade = 1;
		int price = 7000;
		switch (grade) {
			case 1:
				price += 1000;
			case 2:
				price += 1000;
			case 3:
				price += 1000;
		}
		System.out.println(grade + "등급의 제품 가격 : " + price);
	}
}
