package bank;

public class BankAccount {

	// 계좌를 구현하기 위해 필요한 필드
	// 계좌 소유인, 계좌에 남아있는 잔액
	
	// 필드 (접근 제한자명이 없으면 default로 설정됨)
	int balance; // 잔액
	
	// 소유인 -> 소유인을 구성하기 위해선 Person 클래스에 있는 필드값이 필요함
	Person owner; // 소유인 (owner -> Person 클래스에 있는 이름, 나이, 현금보유량의 정보를 가짐)
	
	// 메소드 (입/출금 및 이체)
	// 입급 (파라미터 : 입급할 금액 -> 정수 = int) - deposit
	// 리턴 : 입급성공여부 (불리언)
	boolean deposit(int amount)
	{
		// 만약 나에게 5만원이 있는데 10만원을 입급할 수 없고 -10만원을 입금할 수도 없음 -> 예외처리하기 (if)
		
		if (amount < 0 || owner.cashAmount < amount) // 입금하는 돈이 음수 || 입금하는 돈이 현금보다 큼 -> 입금 실패 (리턴 : false)
		{
			System.out.println(amount + "원 입금 실패입니다. 통장 잔고 : " + balance + "원, 현금 : " + owner.cashAmount);
			
			return false;
		}
		
		// 위에 있는 if 문을 통과했으면 입금이 되도록 함
		// 통장 잔액 -> +
		balance += amount;
		
		// 현재 잔고 -> -
		owner.cashAmount -= amount;
		
		System.out.println(amount + "원 입금하였습니다. 통장 잔고 : " + balance + "원, 현금 : " + owner.cashAmount);
		
		return true;
	}
	
	// 출금 (파라미터 : 출금할 금액 -> 정수 = int) - withdraw
	// 리턴 : 출금성공여부 (불리언)
	boolean withdraw(int amount)
	{
		// 만약 통장에 5만원이 있는데 10만원을 출금할 수 없고 -10만원을 출금할 수도 없음 -> 예외처리하기 (if)
		
		if (amount < 0 || balance < amount) // 출금하는 돈이 음수 || 출금하는 돈이 현재 통장 잔고보다 큼 -> 출금 실패 (리턴 : false)
		{
			System.out.println(amount + "원 출금 실패입니다. 통장 잔고 : " + balance + "원, 현금 : " + owner.cashAmount);
			
			return false;
		}
		
		// 위에 있는 if 문을 통과했으면 출금이 되도록 함
		// 통장 잔액 -> -
		owner.cashAmount += amount;
		
		// 현재 잔고 -> +
		balance -= amount;
		
		System.out.println(amount + "원 출금하였습니다. 통장 잔고 : " + balance + "원, 현금 : " + owner.cashAmount);
		
		return true;
	}
	
	// 이체 (파라미터 : 이체할 금액 -> 정수 = int, 이체할 대상 -> Person) - transfer
	// 리턴 : 이체성공여부 (불리언)
	boolean transfer(int amount, Person person)
	{
		return true;
	}
}
