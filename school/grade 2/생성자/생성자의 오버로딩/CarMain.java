package S21221_java30;

public class CarMain {

	public static void main(String[] args) {
		
		// static과 인스턴스 변수의 차이점
		// static : 단 1개의 변수임. - 모든 인스턴스들이 공유하는 변수임.
		// 인스턴스 : 각기 다른 인스턴스들이 별개의 변수로 가지고 있는 변수임.
		
		Car car1 = new Car();
		System.out.println("Car1.company : " + car1.company);
		System.out.println(car1.s);
		car1.s = "kor";
		
		System.out.println();
		
		Car car2 = new Car("자가용1");
		System.out.println("Car2.company : " + car2.company);
		System.out.println("Car2.model : " + car2.model);
		System.out.println(car2.s);
		car2.s = "usa"; 
		
		System.out.println();
		
		Car car3 = new Car("자가용2", "하얀색");
		System.out.println("Car3.company : " + car3.company);
		System.out.println("Car3.model : " + car3.model);
		System.out.println("Car3.color : " + car3.color);
		System.out.println(car3.s);
		
		System.out.println();
		
		Car car4 = new Car("레저용", "빨강", 200);
		System.out.println("Car4.company : " + car4.company);
		System.out.println("Car4.model : " + car4.model);
		System.out.println("Car4.color : " + car4.color);
		System.out.println("Car4.maxSpeed : " + car4.maxSpeed);
		System.out.println(car4.s);
		
		System.out.println();
		
		// car2라는 별개의 변수가 생성되었음을 의미함.
		System.out.println("test " + car2.model);
	}
}

/*
실행 결과
-------------------------
Car1.company : 현대자동차
우리나라 자동차

Car2.company : 현대자동차
Car2.model : 자가용1
kor

Car3.company : 현대자동차
Car3.model : 자가용2
Car3.color : 하얀색
usa

Car4.company : 현대자동차
Car4.model : 레저용
Car4.color : 빨강
Car4.maxSpeed : 200
usa

test 자가용1
*/
