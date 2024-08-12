package main;

import car.Car;
import tire.HankookTire;
import tire.KumhoTire;

public class CarExample {

	public static void main(String[] args) {
		Car car = new Car(); // 인스턴스 생성
		
		for (int i = 1; i <= 5; i++) {
			int problemLocation = car.run();
			switch (problemLocation) {
				case 1:
					System.out.println("앞왼쪽 HankookTire로 교체");
					car.frontLeftTire = new HankookTire("앞왼쪽", 15);
					break;
					
				case 2:
					System.out.println("앞오른쪽 KumhoTire로 교체");
					car.frontRightTire = new KumhoTire("앞오른쪽", 13);
					break;
					
				case 3:
					System.out.println("뒤왼쪽 HankookTire로 교체");
					car.backLeftTire = new HankookTire("뒤왼쪽", 14);
					break;
					
				case 4:
					System.out.println("뒤오른쪽 KumhoTire로 교체");
					car.backRightTire = new KumhoTire("뒤오른쪽", 177);
					break;
			}
			
			System.out.println("------------------------------");
		}
	}
}

/*
실행 결과
------------------------------
[자동차가 달립니다.]
앞왼쪽 Tire 수명: 5회
앞오른쪽 Tire 수명: 1회
뒤왼쪽 Tire 수명: 2회
뒤오른쪽 Tire 수명: 3회
------------------------------
[자동차가 달립니다.]
앞왼쪽 Tire 수명: 4회
*** 앞오른쪽 Tire 펑크 ***
[자동차가 멈춥니다.]
앞오른쪽 KumhoTire로 교체
------------------------------
[자동차가 달립니다.]
앞왼쪽 Tire 수명: 3회
앞오른쪽 KumhoTire 수명: 12회
뒤왼쪽 Tire 수명: 1회
뒤오른쪽 Tire 수명: 2회
------------------------------
[자동차가 달립니다.]
앞왼쪽 Tire 수명: 2회
앞오른쪽 KumhoTire 수명: 11회
*** 뒤왼쪽 Tire 펑크 ***
[자동차가 멈춥니다.]
뒤왼쪽 HankookTire로 교체
------------------------------
[자동차가 달립니다.]
앞왼쪽 Tire 수명: 1회
앞오른쪽 KumhoTire 수명: 10회
뒤왼쪽 HankookTire 수명: 13회
뒤오른쪽 Tire 수명: 1회
------------------------------
*/
