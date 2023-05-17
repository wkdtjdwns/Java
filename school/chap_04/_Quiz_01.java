// 주차요금은 시간당 4,000원 (일일 최대 요금은 30,000원)
// 경차 또는 장애인 차량은 최종 요금에 50% 할인

// 일반 차량은 5시간 주차 시 20,000원
// 경차는 5시간 주차 시 10,000원

// 출력
// 주차 요금은 xx 원 입니다.

package chap_04;

public class _Quiz_01 {
	public static void main(String[] args) {
		int hour = 10; // 10시간 주차
		boolean isSmallCar = false; // 경차
		boolean withDisabledPerson = true; // 장애인 차량
		
		// 주차 요금 계산
		int fee = hour * 4000; // 시간 * 4,000원
		
		// 30,000원 초과 시 일일 최대 요금으로 수정
		if (fee > 30000) {
			fee = 30000; // 일일 최대 요금(30,000원)으로 수정
		}
		
		// 경차 또는 장애인 차량인 경우 50% 할인
		if (isSmallCar || withDisabledPerson) {
			fee /= 2;
		}
		
		// 실행 결과 출력
		System.out.println("주차 요금은 " + fee + "원 입니다.");
	}
}
