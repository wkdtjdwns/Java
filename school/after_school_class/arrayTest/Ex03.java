package arrayTest;

import java.util.Scanner;

public class Ex03 {

	// 최대 100개의 정수를 차례로 입력 받다가
	// 0이 입력되면 입력을 중단하고, 짝수번째에 입력된 정수를 모두 출력하는 프로그램을 작성하시오.
	
	// 입력 -> 1 2 3 4 5 6 7 8 9 0
	// 출력 -> 2 4 6 8
	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		
		// 배열 선언
		// int[] arr = new [크기];
	
		// 배열 순회
		// for (int i=0; i<arr.length; i++) { }
	
		int[] nums = new int[100];
		int cnt = 0;
		
		for (int i=0; i<nums.length; i++)
		{
			// 배열의 값을 입력 받다가
			nums[i] = sc.nextInt();
			
			// 0이 입력되면 입력을 중단 시키고
			if (nums[i] == 0) break;
			
			cnt++;
		}
		
		sc.close();
		
		// 짝수번째에 입력된 정수를 출력함
		for (int i=0; i<cnt; i+=2) // 입력한 숫자의 개수만큼 반복함
				System.out.print(nums[i+1] + " "); // 짝수번째에 입력된 값을 출력함
	}
}
