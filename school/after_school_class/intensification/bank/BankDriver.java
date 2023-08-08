package bank;

public class BankDriver {

	// 상호작용 되어 있는 객체들을 실행해보는 곳 -> main 함수가 필요함
	public static void main(String[] args) {
		
		// 인스턴스화 (복사본 생성)
		Person p1 = new Person();
		
		// Person 클래스에 값이 들어가는 것이 아닌 Person 클래스의 복사본인 p1 변수에 값이 들어감
		p1.name = "홍길동";
		p1.age = 25;
		p1.cashAmount = 100000;
//		p1.account = ~~~; -> 아직 BankAccount 클래스를 인스턴스화 시키지 않았기 때문에 값을 대입할 수 없음
		
		System.out.println(p1.name);
		System.out.println(p1.age);
		System.out.println(p1.cashAmount);
		
	}
}
