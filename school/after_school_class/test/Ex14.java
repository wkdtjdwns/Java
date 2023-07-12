package test;

import java.util.Scanner;

public class Ex14 {

	// 랜덤 자리 뽑기
	// 행과 열을 입력받은 다음 (전체 자리 수 = 행 * 열)
	// 랜덤한 자리로 1부터 행*열 까지의 수를 임의로 부여함
	
	// 예시 입력
	// 3행 3열
	
	// 예시 출력
	// 9 7 5
	// 1 4 6
	// 3 2 8
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int rows = sc.nextInt();
		int cols = sc.nextInt();
		
		int[] seats = new int[rows*cols];
		
		int cnt = 0;
		for (int i=0; i<seats.length; i++)
		{
			seats[i] = (int)(Math.random() * seats.length + 1);
			
			for (int j=0; j<i; j++)
			{
				if (seats[i] == seats[j])
				{
					i--;
					cnt++;
					break;
				}
			}
		}

		for (int i=0; i<seats.length; i++)
		{
			System.out.printf("%3d", seats[i]); // 3칸 띄우고 출력함	
			
			if (i != 0 && (i+1)%rows == 0) 
			{
				System.out.println();
			}
		}
		
//		System.out.printf("%d번의 중복이 있었습니다.", cnt);
	}
}
