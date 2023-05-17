package chap_04;

import java.util.Scanner;

public class _14_NameLoopEx
{
	public static void main(String[] args) 
	{
		int menu = 0; // 고른 메뉴를 저장할 변수
		int num = 0; // 계산을 하기 위한 값을 저장할 변수
		
		Scanner sc = new Scanner(System.in);
		
		outer: // 바깥 반복문
		while (true) 
		{
	
			System.out.println("(1) square"); 
			System.out.println("(2) square root"); 
			System.out.println("(3) log"); 
			System.out.print("원하는 메뉴(1~3)을 선택하세요. (종료:0)>");
			
			// menu = sc.nextInt();
			String tmp = sc.nextLine();
			menu = Integer.parseInt(tmp);
			
			if (menu == 0) 
			{
				System.out.println("프로그램을 종료합니다.");
				break; // 어짜피 반복문이 1개여서 바깥 반복문 이름을 안 써도 무방함
			} else if ( !(1 <= menu && menu <= 3) )
			{
				System.out.println("메뉴를 잘못 선택하셨습니다. (종료는 0)>");
				continue;
			}
			
			// for문도 무한반복 가능
			for (;;) 
			{
				System.out.println("계산할 값을 입력하세요. (계산종료: 0, 전체종료: 99)>");
				// num = sc.nextInt();
				tmp = sc.nextLine();
				num = Integer.parseInt(tmp);
				
				if (num == 0) 
				{
					break; // 반복문이 2개이기 때문에 작은 반복문만 벗어남 -> 메뉴 선택으로 넘어감
				} else if (num == 99)
				{
					System.out.println("프로그램을 종료합니다.");
					break outer;
				}
				
				switch (menu) 
				{
					case 1:
						System.out.println("result = " + num*num); // 제곱 출력
						break;
					case 2:
						System.out.println("result = " + Math.sqrt(num)); // 제곱근 값 출력
						break;
					case 3:
						System.out.println("result = " + Math.log(num)); // 로그 값 출력
						break;
				}
			}
		}
		sc.close();
	}
}
