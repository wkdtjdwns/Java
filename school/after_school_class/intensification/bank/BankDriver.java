package bank;

public class BankDriver {

	// 상호작용 되어 있는 객체들을 실행해보는 곳 -> main 함수가 필요함
	public static void main(String[] args) {
		
		// 인스턴스화 (복사본 생성)
		// 인스턴스를 생성하기 위해서는 '생성자'를 사용해야 함
		// 생성자는 인스턴스를 생성하는 메소드라고 이해하기!
		// 생성자는 new 키워드와 함께 클래스 이름과 동일한 이름으로 적어줌
		
		Person p1 = new Person(); // new 뒤에 있는 Person() <- 이 부분이 생성자임 // 메소드들 중에서도 특별한 것들이 생성자임 (메소드처럼 ()를 사용함)
		
		// Person 클래스에 값이 들어가는 것이 아닌 Person 클래스의 복사본인 p1 변수에 값이 들어감
		p1.setName("홍길동");
//		p1.age = 25;
		// 접근 제어자가 private인 변수에 접근하기 (p1에 있는 setAge() 메소드 활용
		p1.setAge(-15);
		p1.setAge(25);
		p1.setCashAmount(30000);
//		p1.account = ~~~; -> 아직 BankAccount 클래스를 인스턴스화 시키지 않았기 때문에 값을 대입할 수 없음
		
//		System.out.println(p1.name);
		
		// 접근 제어자가 private인 변수를 출력하기 위한 코드
		System.out.println(p1.getAge());
//		System.out.println(p1.cashAmount);
		
		// 계좌 만들기 (인스턴스화)
		BankAccount a1 = new BankAccount();
		a1.setBalance(100000);
		
//		System.out.println(a1.balance);
		
		// ★두 객체의 관계 설정 (상호작용)★
		p1.setBankAccount(a1);
		a1.setOwner(p1);
		
		// 테스트 (ooo님의 계좌 잔액은 ooo원 입니다.)
//		System.out.println(p1.name + "님의 계좌 잔액은 " + p1.account.balance + "원 입니다.");
		// p1.account.balance -> p1 변수의 account 변수로 이동 -> account의 값은 a1 변수의 값임 -> a1 변수의 balance 변수에 접근함
		
		// 입금 메소드 테스트 (2만원 입금하기, 1만 5천원 입금하기 및 -1만원 입금하기)
		a1.deposit(20000); // <- 이처럼 계좌의 입장에서 입/출금 할 수도 있고
//		p1.account.deposit(20000); <- 이처럼 사람의 입장에서 입/출금 할 수 있음
		a1.deposit(15000);
		a1.deposit(-10000);

		System.out.println();
		p1.setCashAmount(30000);
		a1.setBalance(100000);
		
		// 출금 메소드 테스트 (1만 5천원 출금하기, 9만원 출금하기 및 -2만원 출금하기)
		a1.withdraw(15000);
		a1.withdraw(90000);
		a1.withdraw(-20000);

		System.out.println();
		p1.setCashAmount(30000);
		a1.setBalance(100000);
		
		// 이체 메소드 테스트 (1만 5천원 이체하기, 9만원 이체하기 및 -2만원 이체하기)
		
		// p2 객체 생성
		Person p2 = new Person();
		p2.setName("장발장");
//		p2.age = 30;
		p2.setAge(30);
		System.out.println(p2.getAge());
		p2.setCashAmount(15000);
		
		// a2 객체 생성
		BankAccount a2 = new BankAccount();
		a2.setBalance(50000);
		
		// 두 객체 상호작용
		p2.setBankAccount(a2);
		a2.setOwner(p2);

		System.out.println(p2.getName() + "님의 계좌 잔액은 " + p2.getBankAccount().getBalance() + "원 입니다.");
		
		a1.transfer(15000, p2);
		System.out.println(p2.getName() + "님의 계좌 잔액은 " + p2.getBankAccount().getBalance() + "원 입니다.");
		
		a1.transfer(90000, p2);
		System.out.println(p2.getName() + "님의 계좌 잔액은 " + p2.getBankAccount().getBalance() + "원 입니다.");
		
		a1.transfer(-20000, p2);
		System.out.println(p2.getName() + "님의 계좌 잔액은 " + p2.getBankAccount().getBalance() + "원 입니다.");
		
		System.out.println();
		p1.setCashAmount(30000);
		a1.setBalance(100000);

		// 이체2 메소드 테스트 (1만 5천원 이체하기, 9만원 이체하기 및 -2만원 이체하기)
		System.out.println(a2.getOwner().getName() + "통장의 계좌 잔액은 " + a2.getBalance() + "원 입니다.");
		
		a1.transfer(15000, a2);
		System.out.println(a2.getOwner().getName() + "통장의 계좌 잔액은 " + a2.getBalance() + "원 입니다.");
		
		a1.transfer(90000, a2);
		System.out.println(a2.getOwner().getName() + "통장의 계좌 잔액은 " + a2.getBalance() + "원 입니다.");
		
		a1.transfer(-20000, a2);
		System.out.println(a2.getOwner().getName() + "통장의 계좌 잔액은 " + a2.getBalance() + "원 입니다.");
		
		// 이체 3 메소드 테스트
		p1.transfer(20000, p2);
		System.out.println(p2.getName() + "님의 계좌 잔액은 " + p2.getBankAccount().getBalance() + "원 입니다.");
		
		// 이체 4 메소드 테스트
		p2.transfer(20000, a1);
		System.out.println(a1.getOwner().getName() + "통장의 계좌 잔액은 " + a1.getBalance() + "원 입니다.");
	}
}
