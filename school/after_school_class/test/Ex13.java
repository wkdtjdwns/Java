package test;

import java.util.Scanner;

public class Ex13 {

	// 어떤 숫자를 입력받고, 해당 숫자까지의 홀수의 합과 짝수의 합을 구하시오.
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		sc.close();
		
		int even_sum = 0;
		int odd_sum = 0;
		
		for (int i=1; i<=n; i++)
		{
			if (i%2 == 0)
			{
				even_sum += i;
			}
			
			else
			{
				odd_sum += i;
			}
		}
		
		System.out.printf("1부터 %d 까지의 홀수의 합 : %d\n1부터 %d 까지의 짝수의 합 : %d", n, odd_sum, n, even_sum);
		
//		n = 10
//		홀수 = 1 + 3 + 5 + 7 + 9 = 25
//		짝수 = 2 + 4 + 6 + 8 + 10 = 30 
	}
}
