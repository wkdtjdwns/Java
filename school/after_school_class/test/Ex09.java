package test;

import java.util.Scanner;

public class Ex09 {

	// π 값 구하기
	// (4/1) - (4/3) + (4/5) - (4/7) + (4/9) - (4/11) ...
	
	// 입력받은 값만큼만 반복하기!
	
	// 입력 = 5 / 출력 = 3.3396825396825403
	// 입력 = 100 / 출력 = 3.1315929035585537
	// 입력 = 10000 / 출력 = 3.1414926535900345
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double pi = 0;
		double deno = 1; // 분모 값
		int sign = 1;    // 부호 (1, -1)		
		
		int n = sc.nextInt();
		sc.close();
		
		for (int i=0; i<n; i++)
		{
			pi += (4/deno) * sign;
			deno += 2;
			sign *= -1;
		}
		
		System.out.println(pi);
	}
}
