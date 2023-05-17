package test;

import java.util.Scanner;

public class Ex05 {
	
	// 1부터 100중의 랜덤한 수를 맞추는 게임
	// 예를 들어 cpu가 69를 뽑았다고 가정하면
	// 플레이어가 50을 입력했을 때, UP이라고 응답, 70을 입력했을 때는, DOWN이라고 응답
	
	// 출력 -> 몇번 시도했는지 출력
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int ranNum = (int)(Math.random() * 100) + 1; // 1 ~ 100중 랜덤한 수
		// Math.random() -> 0.0000000 ~ 0.9999999 중 발생
		// Math.random() * 100 -> 0.0000000 ~ 99.9999999 중 발생
		// (int)(Math.random() * 100) -> 0 ~ 99 중 발생
		// (int)(Math.random() * 100) + 1 -> 1 ~ 100 중 발생
		
		int cnt = 0;
		
    // while문
		while (true) 
		{
			int answer = sc.nextInt();
			cnt++;
			if (answer > ranNum) System.out.println("DOWN"); 
			else if (answer < ranNum) System.out.println("UP"); 
			else break;
		}
		
		sc.close();
		
		System.out.printf("%d번만에 정답을 맞추셨습니다!", cnt);
		
		/* do - while문
		Scanner sc = new Scanner(System.in);
		
		int ranNum = (int)(Math.random() * 100) + 1; // 1 ~ 100중 랜덤한 수
		
		int answer;
		
		int cnt = 0;
		
		do 
		{
			answer = sc.nextInt();
			cnt++;
			if (answer > ranNum) System.out.println("DOWN"); 
			else if (answer < ranNum) System.out.println("UP"); 
			else break;
		} while (answer != ranNum);
		
		System.out.printf("%d번만에 정답을 맞추셨습니다!", cnt);
		*/
	}
}
