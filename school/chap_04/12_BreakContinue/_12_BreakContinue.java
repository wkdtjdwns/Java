package chap_04;

import java.util.Scanner;

public class _12_BreakContinue
{
	public static void main(String[] args) 
	{
		int menu = 0;
		int num = 0;
		
		// 입력하기 (Scanner를 sc 변수에 담아서 씀)
		Scanner sc = new Scanner(System.in);
		
		// 무한 반복
		while (true) 
		{
			System.out.println("(1) square"); // 제곱미터
			System.out.println("(2) square root"); // 제곱근
			System.out.println("(3) log"); // 로그
			System.out.print("원하는 메뉴(1~3)을 선택하세요. (종료:0)>");
			
			// 입력을 일시적으로 저장할 변수
			String tmp = sc.nextLine();
			
			/*
			menu = tmp -> menu는 int형, tmp는 String형이기 때문에 오류가 뜸
			그래서 형변환을 시켜 줘야하는데
			(int)tmp로 사용 할 수는 없음 -> String은 참조형 변수이기 때문
			*/
			
			// 형변환 방법 (참조형 변수로)
			menu = Integer.parseInt(tmp);
			
			if (menu == 0) 
			{
				System.out.println("프로그램을 종료합니다.");
				break;
			} else if (!(1 <= menu && menu <= 3)) // 메뉴 값이 1 ~ 3이 아닐 때 
			{ 
				System.out.println("메뉴를 잘못 선택하였습니다. (종료는 0)");
				continue;
			}
			System.out.println("선택하신 메뉴는 " + menu + "번 입니다.");
		}
		// 입력을 모두 다 했다면 sc 변수를 닫아줘야함
		sc.close();
	}
}
