package S21221_00;

// 클래스 정의
class Circle {
	int radius;							// 자료형 필드 반지름
	String color;						// 자료형 필드 색상
	double calcArea() {					// 반환형 메소드
		return 3.14 * radius * radius;	// 해당 값 리턴 
	}
}

public class S21221_99_ValueClassTest {
	
	public static void main(String[] args){
		
		Circle a;					// 참조 변수 선언
		a = new Circle();			// 객체 생성
		a.radius = 100;				// 객체 필드 접근
		a.color = "Blue";			// 객체 필드 접근
		double area = a.calcArea(); // 객체 메소드 접근
		System.out.println("a필드 색상 : " + a.color + " 원의 면적 = " + area);

		Circle b;
		b = new Circle();
		b.radius = 20;
		b.color = "White";
		area = b.calcArea(); // 객체 메소드 접근
		System.out.println("b필드 색상 : " + b.color + " 원의 면적 = " + area);

		Circle c;
		c = new Circle();
		area = c.calcArea(); // 객체 메소드 접근
		System.out.println("c필드 색상 : " + c.color + " 원의 면적 = " + area);
	}
}

/*
실행 결과
------------------------------------
a필드 색상 : Blue 원의 면적 = 31400.0
b필드 색상 : White 원의 면적 = 1256.0
c필드 색상 : null 원의 면적 = 0.0
*/
