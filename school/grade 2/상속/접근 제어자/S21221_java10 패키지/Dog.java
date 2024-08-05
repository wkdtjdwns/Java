package S21221_java10;

//default 이하로 내려가면 Matiz가 상속받지 못하게 됨.
public class Dog extends Animal { 

	// 이 메소드 또한 default 이하로 내려가면 Matiz가 상속받지 못하게 됨.
	protected void a() {
		System.out.println("2. Dog_protected 상속의 오버라이딩 난 멍멍이입니다^^");
	}
}
