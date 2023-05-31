package test;

import java.util.Scanner;

public class Ex10 {

	// 피보나치 수열
	// 입력한 숫자 (3이상의 정수)만큼 피보나치 수열 출력
	// 출력된 수열의 모든 합을 구해서 출력
	// 입력 -> 5 / 출력 -> 1 1 2 3 5
	//                -> 12
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		sc.close();
		
		int prevPrevNum = 1;
		int PrevNum = 1;
		int sum = prevPrevNum + PrevNum; // n이 1이거나 2일때는 1
		
		System.out.print(prevPrevNum + " ");
		System.out.print(PrevNum + " ");
		
		for (int i=3; i<=n; i++) // n이 3이상일 때 즉, 1또는 2가 아닐때만 실행가능
		{
			int curNum = prevPrevNum + PrevNum;
			sum += curNum;
			
			System.out.print(curNum + " ");
			
			prevPrevNum = PrevNum;
			PrevNum = curNum;
		}
		
		System.out.println();
		System.out.println(sum);
		
	}
}
