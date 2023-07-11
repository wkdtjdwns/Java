package test;

import java.util.Scanner;

public class Ex04 {
	
	// 어떤 정수 n을 입력받고, 1부터 홀수를 차례대로 더해 나가면서 합이 n보다 크면
	// 그 때까지 더한 홀수의 개수와 그 합을 출력하시오.
	
	// 입력 = 10
	// 1 + 3 + 5 + 7 = 16 / 16 > 10 -> 반복 멈춤
	// 출력 = 4, 16
	
	// 입력 = 1000
	// 출력 = 32, 1024
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		sc.close();
		
		int sum = 0;
		int cnt = 0;
		
		for (int i=1; ; i+=2) 
		{
			if (sum > n) break;
			
			sum += i;
			cnt++;
		}

//		for (int i=1; ; i++)
//		{
//			if (i%2 != 0)
//			{
//				sum += i;
//				cnt++;
//			}
//			
//			if (sum > n)
//			{
//				break;
//			}
//		}
		
		System.out.printf("%d, %d", cnt, sum);
	}
}
