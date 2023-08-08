package bank;

public class BankAccount {

	// 계좌를 구현하기 위해 필요한 필드
	// 계좌 소유인, 계좌에 남아있는 잔액
	
	// 필드 (접근 제한자명이 없으면 default로 설정됨)
	int balance; // 잔액
	
	// 소유인 -> 소유인을 구성하기 위해선 Person 클래스에 있는 필드값이 필요함
	Person owner; // 소유인 (owner -> Person 클래스에 있는 이름, 나이, 현금보유량의 정보를 가짐)
	
}
