package arrayTest;

import java.util.Scanner;

public class Ex04 {

	// 100개의 정수를 저장할 수 있는 배열을 선언하고
	// 정수를 차례로 입력하다가 0이 입력되면 입력을 멈추고
	// 가장 마지막에 입력된 수 부터 역순으로 출력하시오.
	
	// 입력 -> 1 2 3 4 5 6 7 0
	// 출력 -> 7 6 5 4 3 2 1
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] nums = new int[100];
		int cnt = 0;
		
		for (int i=0; i<nums.length; i++)
		{
			nums[i] = sc.nextInt();
			
			if (nums[i] == 0) 
				break;
			
			cnt++;
		}
		
		sc.close();
		
		for (int i=cnt-1; i>=0; i--)
			System.out.print(nums[i] + " ");
	}
}
