package S21221_java30;

public class Car {

	static String s = "우리나라 자동차";
	
	// 필드 인스턴스 변수
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	// 생성자 1
	Car() {} // 기본 생성자 (다른 생성자를 만들 것이기 때문에 정의 해줘야 함)
	
	// 생성자 2
	Car(String model) {
		
		// model : 로컬 변수 (파라미터)
		// this.model : 필드 인스턴스 변수
		this.model = model;
	}
	
	// 생성자 3
	Car(String model, String color) {
		this.model = model;
		this.color = color;
	}
	
	// 생성자 4
	Car(String model, String color, int maxSpeed) {
		this.model = model;			// 공통 실행 코드
		this.color = color;			// 공통 실행 코드
		this.maxSpeed = maxSpeed;	// 공통 실행코드
	}
}
