package car;

import tire.Tire;

public class Car {

	// 필드
	public Tire frontLeftTire = new Tire("앞왼쪽", 6);
	public Tire frontRightTire = new Tire("앞오른쪽", 2);
	public Tire backLeftTire = new Tire("뒤왼쪽", 3);
	public Tire backRightTire = new Tire("뒤오른쪽", 4);
	
	// 생성자: 없음
	
	// 메소드
	public int run() {
		System.out.println("[자동차가 달립니다.]");
		
		if (!frontLeftTire.roll()) { stop(); return 1; }
		if (!frontRightTire.roll()) { stop(); return 2; }
		if (!backLeftTire.roll()) { stop(); return 3; }
		if (!backRightTire.roll()) { stop(); return 4; }
		
		return 0;
	}
	
	void stop() {
		System.out.println("[자동차가 멈춥니다.]");
	}
}
