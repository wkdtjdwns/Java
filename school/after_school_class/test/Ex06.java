package test;

import java.util.Scanner;

public class Ex06 {

	// 팩토리얼 계산기
	// 팩토리얼 -> 5! = 5 * 4 * 3 * 2 * 1 = 120
	
	// 어떤 수 num을 입력받으면 그 수의 팩토리얼 값을 출력!
	public static void main(String[] args) {
		
		// for문
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		sc.close();
		
		long fac = 1L; // 누적 곱을 구해야 할때는 항상 1로 초기화 시켜야 함
		// int sum = 0 // 누적 합을 구해야 할때는 항상 0으로 초기화 시켜야 함
		
		for (int i=num; i>=1; i--) fac *= i;
		
		System.out.printf("%d! = %d", num, fac);
		
		/* while문
	    Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		sc.close();
		
		long fac = 1L;
		
		while (num > 1) // 1은 곱하든 말든 값은 똑같기 때문에 1을 곱하기 위해 반복문을 돌리는 시간을 줄이기 위해 1을 곱하지 않음
		{
			fac *= num;
			num--;	
		}

		System.out.printf("%d! = %d", num, fac); */
	}
	
}
