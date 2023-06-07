package arrayTest;

import java.util.Scanner;

public class Ex06 {

	// 1. 10개의 정수를 입력받아 nums 배열에 저장한다.
	// 2. 입력받은 10개의 정수 중 가장 큰 수를 출력하는 프로그램을 만드시오.
	public static void main(String[] args) {
		
		// 나의 풀이
		Scanner sc = new Scanner(System.in);
		
		// 10칸 짜리 배열 생성하기
		int[] nums = new int[10];
		
		// 배열의 값 할당하기
		for (int i=0; i<nums.length; i++) 
			nums[i] = sc.nextInt();
		
		// 최댓값을 저장할 변수 초기화 하기
		int max = nums[0];
		
		// 최댓값 찾기
		for (int i=1; i<nums.length; i++) 
			if (max < nums[i]) max = nums[i];	
		
		sc.close();
		
		// 최댓값 출력하기
		System.out.println(max);
		
		// 선생님의 풀이 (import 및 main은 똑같으니 생략)
		
//		Scanner sc = new Scanner(System.in);
//		
//		int nums[] = new int[10];
//		int max;
//		
//		// 배열에 값 할당하기
//		for (int i=0; i<nums.length; i++)
//		{
//			nums[i] = sc.nextInt();
//		}
//
//		// 최댓값 초기화
//		max = nums[0];
//		
//		// 최댓값 체크하기
//		for (int i=1; i<nums.length; i++)
//		{
//			if (max < nums[i])
//			{
//				max = nums[i];
//			}
//		}
//		
//		// 복습을 위한 향상된 for문 (for-each문)을 사용해서 배열의 모든 값 출력하기!
//		for (int num : nums)
//		{
//			System.out.print(num + " ");
//		}
//		
//		// 최댓값 출력하기
//		System.out.println();
//		System.out.println(max);
	}
}
