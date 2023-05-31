package arrayTest;

import java.util.Scanner;

public class Ex02 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 10칸짜리 정수형 배열 선언 - nums
		int[] nums = new int[10];
		
		// 반복문을 이용하여 임의의 정수값을 배열에 넣기
		System.out.println("10개의 정수를 입력하세요.");
		for (int i=0; i<nums.length; i++) nums[i] = sc.nextInt();
		
		// 3칸짜리 정수형 배열 선언 - except
		int[] except = new int[3];
		
		// except 배열에 1부터 10까지의 숫자 중 임의의 숫자 3개 (1이상의 정수값) 입력
		System.out.println("출력하고자 하는 3개의 위치를 입력하세요.");
		for (int i=0; i<except.length; i++) except[i] = sc.nextInt();
		
		// except 배열에 있는 숫자 번째에 해당하는 nums 배열의 값을 출력
		// ex) except -> 3, 6, 9 / 출력 -> nums[2], nums[5], nums[6]
		for (int i=0; i<except.length; i++) System.out.print(nums[except[i] - 1] + " ");	
	}
}
