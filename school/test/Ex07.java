package test;

import java.util.Scanner;

public class Ex07 {

	// 삼각형의 빗변의 길이를 입력했을 때, 직각 삼각형이 될 수 있는지의 여부를 판단하는 프로그램
	// 세 변의 길이는 각각 100을 넘지 않으며, 정수값만 가짐
	// 피타고라스의 정리를 이용!!!
	
	// 빗변 = 5 -> 가능
	// 빗변 = 6 -> 불가능
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int c = sc.nextInt();
		sc.close();
		
		boolean possible = false;
	
		Loop1: // 전체 반복문의 이름
		for (int a=1; a<100; a++) 
		{
			for (int b=1; b<100; b++) 
				{
					if (a*a + b*b == c*c) 
						{
							System.out.println("가능");
							possible = true;
							break Loop1; // 전체 반복문 종료
						}
				}
		}
		
		if (!possible) System.out.println("불가능");
	}
}
