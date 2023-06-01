package test;

import java.util.Scanner;

public class Ex12 {

	// 어떤 수를 입력받으면 그 수가 소수인지 아닌지 판별하는 프로그램을 작성하시오.
	// 소수 : 1과 자기 자신만을 약수로 가지는 수 (1은 소수가 아님)
	
	// 3 -> 약수 : 1, 3 -> 소수 O
	// 4 -> 약수 : 1, 2, 4 -> 소수 X
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		sc.close();
		
		boolean isPrime = false;
		
		// 어차피 1은 모든 수의 약수이기 때문에 i가 1일때는 필요가 없음 (없애는 편이 시간적으로 이득)
		for (int i=2; i<=n/2; i++) // 약수는 모두 반복되기 때문에 2를 나눠서 반복을 돌리는게 시간적으로 이득임
		{
			if (n%i != 0)
			{
				isPrime = true; // 위에서 false로 초기화 해주었기 때문에 굳이 else문을 사용할 필요 X
				break;
			}
		}
		
		// 삼항 연산자를 사용해서 isPrime이 true면 "소수"를 false면 "소수X"를 출력함 -> if문을 사용할 필요 X
		System.out.printf(isPrime ? "소수" : "소수X"); 
	}
}
