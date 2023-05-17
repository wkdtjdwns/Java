package test;

import java.util.Scanner;

public class Ex03 {
	
	// 값을 하나 입력받고, 1부터 1씩 증가하면서 누적합을 구하다가
	// 누적합이 입력받은 값보다 커지는 순간(같을 때는 해당 안됨) 반복을 중단하고,
	// 그 때 마지막으로 더해진 값과 총합을 구하시오.
	
	// 입력 = 10
	// 1 + 2 + 3 + 4 + 5 = 15 / 15 > 10 -> 반복 멈춤
	// 출력 = 5, 15
	
	// 입력 = 1000
	// 출력 = 45, 1035
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		sc.close();
		
		int i = 0;
		int sum = 0;
		
		// while문
		while (true)
		{
			if (sum > num) break;
			
			i++;
			sum += i;
		}
		
		System.out.printf("%d, %d", i, sum);

		/* for문
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		sc.close();
		
		int i;
		int sum = 0;
		
		for (i=1; ; i++) 
		{
			if (sum > num) break;
			
			sum += i;			
		}
		
		System.out.printf("%d, %d", i-1, sum);
		*/
	}
}
