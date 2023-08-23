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
	
	// 접근제어자가 private인 변수를 다른 클래스에서 사용할 수 있도록 public 메서드를 하나 만듬
	public void setName(String newName)
	{
		name = newName;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setCashAmount(int newCashAmount)
	{
		if (newCashAmount > 0)
		{
			cashAmount = newCashAmount;
		}
		
		else
		{
			System.out.println("올바른 나이를 입력하세요.");
		}
	}
	
	public int getCashAmount()
	{
		return cashAmount;
	}
	
	public void setAge(int newAge) // 파라미터로 나이를 받아와서 계산함
	{
		if (newAge > 0) // 파라미터로 올바른 나이를 받아왔다면
		{
			// 해당 클래스의 private의 age라는 변수 값을 받아온 나이로 만들어서 저장시켜줌
			age = newAge;
		}
		
		else
		{
			System.out.println("올바른 나이를 입력하세요.");
		}
	}
	
	// 나이를 얻기 위한 메소드
	public int getAge()
	{
		// 위에 있는 메소드로 정해놓은 나이를 리턴시킴
		return age;
	}
	
	public void setBankAccount(BankAccount newBankAccount)
	{
		account = newBankAccount;
	}
	
	// 나이를 얻기 위한 메소드
	public BankAccount getBankAccount()
	{
		// 위에 있는 메소드로 정해놓은 나이를 리턴시킴
		return account;
	}
	
	
	// 이체 (파라미터 : 이체할 금액 -> 정수 = int, 이체할 대상 -> Person) - transfer
	// 리턴 : 이체성공여부 (불리언)
	boolean transfer(int amount, Person to)
	{
		if (amount < 0 || account.balance < amount) // 이체하는 돈이 음수 || 이체하는 돈이 현재 통장 잔고보다 큼 -> 출금 실패 (리턴 : false)
		{
			System.out.println(name + "님이 " + to.name + "님에게 " + amount + "원 이체 실패하였습니다. 통장 잔고 : " + account.balance + "원, 현금 : " + cashAmount);
			
			return false;
		}
		
		// 나의 현금 -> -
		account.balance -= amount;
		
		// 이체 대상의 통장 잔액 -> +
		to.account.balance += amount;
		
		System.out.println(name + "님이 " + to.name + "님에게 " + amount + "원 이체하였습니다. 통장 잔고 : " + account.balance + "원, 현금 : " + cashAmount);
		
		return true;
	}
	
	// 이체2 (파라미터 : 이체할 금액 -> 정수 = int, 이체할 대상 -> BankAccount) - transfer
	// 리턴 : 이체성공여부 (불리언)
	boolean transfer(int amount, BankAccount to)
	{	
		// 위와 같이 코드를 계속 써내려가는 것 보다는 위에서 정의한 메소드를 재활용 하는 것이 좋음 (오버로딩의 사용 이유)
		return transfer(amount, to.owner);
	}
}
