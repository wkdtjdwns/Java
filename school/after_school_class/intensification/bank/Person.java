package bank;

// 클래스 -> 설계도!
// 객체지향언어에서는 재활용이 제일 중요함 -> 하나의 클래스를 한번만 쓰는 것이 아닌 다른 누군가가 같이 사용하는 것!
// 하지만 누군가가 사용할 때 클래스의 내용을 변경하면 사용하기 어려워짐 -> 그래서 생성자를 이용해서 복사본을 전달해줌

public class Person {
	
	// 입금 및 출금을 하기 위해선 어떤 사람이 입/출금하였는지 또는 누가 누구에게 이체하였는지 등등의 정보가 필요함
	// -> 그래서 사람의 이름 및 나이와 가지고 있는 돈, 계좌에 대한 정보가 필요함
	
	// 사람이 은행에 가입할 때마다 이 클래스를 복제해서 사람의 정보를 저장함
	
	// 필드 (접근 제한자명이 없으면 default로 설정됨 - default는 같은 패키지 내에서 접근이 가능함)
	private String name;    // 이름
	private int age;        // 나이
	private int cashAmount; // 현금보유량
	
	// 계좌 -> 계좌를 구성하기 위해선 BankAccount 클래스에 있는 필드값이 필요함
	private BankAccount account; // 계좌 정보 (account -> BankAccount 클래스에 있는 잔액의 정보를 가짐)
	
	// 생성자란? :생성자는 이름이 클래스와 동일한 메소드임

	// 생성자의 역할
	// - 인스턴스를 생성함
	// - 인스턴스의 속성 (인스턴스 변수 -> 클래스의 필드값)의 초기화

	// 기본 생성자 (빈 생성자 -> 파라미터, 메소드 등이 하나도 없음) : 생성자를 한 개도 정의하지 않으면 java에서 자동으로 기본 생성자를 제공해줌
	// - 생성자를 하나라도 정의하면 기본 생성자는 사용자는 자동으로 생성되지 않음 -> 기본 생성자를 자신이 직접 정의해줘야함
	
	// 생성자도 오버로딩이 가능함 - 생성자도 메소드이기 때문
	// 기본 생성자 : 파라미터, 메소드 등이 단 한개도 없는 메소드
	public Person()
	{
		
	}
	
	// 인스턴스화를 할 때 파라미터로 있는 변수값을 할당 할 수 있음
//	public Person(String newName)
//	{
//		name = newName;
//	}
//	
//	public Person(String newName, int newAge)
//	{
//		name = newName;
//		
//		if (newAge >= 0)
//		{
//			age = newAge;	
//		}
//	}
	
	// this를 사용했을 때 : 현재 필드의 변수명과 파라미터의 변수명을 구분할 수 있게 함
	public Person(String name)
	{
		this.name = name;
	}
	
	public Person(String name, int age)
	{
		this.name = name;
		
		if (age >= 0)
		{
			this.age = age;	
		}
	}
	
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age >= 0)
			this.age = age;
	}

	public int getCashAmount() {
		return cashAmount;
	}

	public void setCashAmount(int cashAmount) {
		this.cashAmount = cashAmount;
	}

	public BankAccount getAccount() {
		return account;
	}

	public void setAccount(BankAccount account) {
		this.account = account;
	}

	// 이체 (파라미터 : 이체할 금액 -> 정수 = int, 이체할 대상 -> Person) - transfer
	// 리턴 : 이체성공여부 (불리언)
	boolean transfer(int amount, Person to)
	{
		if (amount < 0 || account.getBalance() < amount) // 이체하는 돈이 음수 || 이체하는 돈이 현재 통장 잔고보다 큼 -> 출금 실패 (리턴 : false)
		{
			System.out.println(name + "님이 " + to.name + "님에게 " + amount + "원 이체 실패하였습니다. 통장 잔고 : " + account.getBalance() + "원, 현금 : " + cashAmount);
			
			return false;
		}
		
		// 나의 현금 -> -
		account.setBalance(account.getBalance() - amount);
		
		// 이체 대상의 통장 잔액 -> +
		to.account.setBalance(to.account.getBalance() + amount);
		
		System.out.println(name + "님이 " + to.name + "님에게 " + amount + "원 이체하였습니다. 통장 잔고 : " + account.getBalance() + "원, 현금 : " + cashAmount);
		
		return true;
	}
	
	// 이체2 (파라미터 : 이체할 금액 -> 정수 = int, 이체할 대상 -> BankAccount) - transfer
	// 리턴 : 이체성공여부 (불리언)
	boolean transfer(int amount, BankAccount to)
	{	
		// 위와 같이 코드를 계속 써내려가는 것 보다는 위에서 정의한 메소드를 재활용 하는 것이 좋음 (오버로딩의 사용 이유)
		return transfer(amount, to.getOwner());
	}
}
