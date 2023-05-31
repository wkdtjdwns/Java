package arrayTest;

import java.util.Scanner;

public class Ex01 {

	// 5칸짜리의 정수형 배열을 생성한 후
	// 아무 정수나 5개를 입력받아 출력하시오.
	
	// 반드시 배열을 사용해서 풀기!
	
	// 입력 -> 1 2 3 4 5 / 출력 -> 1 2 3 4 5
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 배열 생성방법
		int[] nums = new int[5];
		
		// 배열을 순회하는 방법 - 입력
		for (int i=0; i<nums.length; i++) nums[i] = sc.nextInt();
		
		sc.close();
		
		// 배열을 순회하는 방법 - 출력
		for (int num : nums) System.out.print(num + " ");
		
		System.out.println();
		
		// 일반 for문
		for (int i=0; i<nums.length; i++) System.out.print(nums[i] + " ");
	}
}
