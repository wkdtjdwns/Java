package s21221_java04;

import java.util.Scanner;

public class S21221_Atm {

	static int bankAcount; // 클래스 변수
	int acount; // 인스턴스 변수
	
	public static void main(String[] args) {
		
		// 참조 변수
		S21221_Atm a = new S21221_Atm();
		S21221_Atm b = new S21221_Atm();

		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.print("\r메뉴선택 : 1. 입급, 2. 출금, 9. 종료 >>> ");
			int selectMenu = sc.nextInt();
			
			if (checkBreak(selectMenu)) break;
			if (checkContinue(selectMenu)) continue;
			
			System.out.print("\r계좌 선택 : 이전 메뉴 = 0, A = 1, B = 2, 종료 = 9 >>> ");
			int selectAcount = sc.nextInt();
			
			if (checkBreak(selectAcount)) break;
			if (checkContinue(selectAcount)) continue;
			
			System.out.print("\r금액입력 >>> ");
			int money = sc.nextInt();
			
			S21221_Atm user = selectAcount == 1 ? a : b;
			user.acount = moneyCalculate(selectMenu, user, money);
			
			showStatue(a, b);
			
		} while (true);
		
		sc.close();
	}
	
	static boolean checkBreak(int select) {
		
		boolean result = false;
		
		if (select == 9) {
		
			System.out.println("이용해 주셔서 감사합니다 ^^");
			result = true;
		}
		
		return result;
	}
	
	static boolean checkContinue(int select) {

		boolean result = false;
		
		if (select == 0) {
			System.out.println("이전 메뉴로 돌아갑니다.");
			result = true;
		}
		
		else if (select < 1 || select > 2) {
			System.out.println("올바른 값을 넣어주세요.");
			result = true;
		}
		
		return result;
	}
	
	static int moneyCalculate(int menu, S21221_Atm user, int money_value) {
		
		money_value = menu == 1 ? money_value : money_value * (-1); 
		
		bankAcount += money_value;	
		return user.acount + money_value;
	}
	
	static void showStatue(S21221_Atm a, S21221_Atm b) {
		System.out.println("A잔액 : " + a.acount + " 총금액 : " + bankAcount);
		System.out.println("B잔액 : " + b.acount + " 총금액 : " + bankAcount);
		System.out.println("총금액 : " + bankAcount);
	}
}
