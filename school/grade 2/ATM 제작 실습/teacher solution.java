package s21221_java04;

import java.util.Scanner;

public class S21221_Atm {

	// 생성자로 해당 변수들을 사용할 때 초기화가 되기 때문에 " = 0 "을 사용해서 초기화 해주지 않아도 됨.
	static int bankAcount; // 클래스 변수
	int acount; // 인스턴스 변수
	
	public static void main(String[] args) {
		
		// 참조 변수
		S21221_Atm2 a = new S21221_Atm2();
		S21221_Atm2 b = new S21221_Atm2();
		
		do {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("\r메뉴선택 : 1. 입급, 2. 출금, 9. 종료");
			int selectMenu = sc.nextInt();
			
			if (selectMenu == 9) break;
			if (selectMenu < 1 || selectMenu > 2) continue;
			
			System.out.println("\r계좌 선택 : 이전 메뉴 = 0, A = 1, B = 2, 종료 = 9");
			int selectAcount = sc.nextInt();
			
			if (selectAcount == 9) break;
			if (selectAcount < 1 || selectAcount > 2) continue;
			
			System.out.println("\r금액입력 :");
			int money = sc.nextInt();
			
			if (selectMenu == 1) {
				if (selectAcount == 1) {
					a.acount += money;
					bankAcount += money;
				}
				
				if (selectAcount == 2) {
					b.acount += money;
					bankAcount += money;
				}
			}
			
			if (selectMenu == 2) {
				if (selectAcount == 1) {
					a.acount -= money;
					bankAcount -= money;
				}
				
				if (selectAcount == 2) {
					b.acount -= money;
					bankAcount -= money;
				}
			}
			
			System.out.println("A잔액 : " + a.acount + " 총금액 : " + bankAcount);
			System.out.println("B잔액 : " + b.acount + " 총금액 : " + bankAcount);
			System.out.println("총금액 : " + S21221_Atm.bankAcount); // 그냥 bankAcount로 써도 됨.
		} while (true);
		System.out.println("이용해 주셔서 감사합니다^^");
	}
}
