package test;

import java.util.Scanner;

public class Ex02 {
	
    // 입력받은 정수만큼(랜덤하게 정함) 성적을 입력받아서 총점과 평균을 출력하시오.
	// 총 0명의 학생의 총점은 00점이고, 평균은 00.0점이다.
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("몇 명의 성적을 입력받곘습니까?");
		int students = sc.nextInt();
		
		int sum = 0;
		
		for (int i=0; i<students; i++) 
		{
			int score = sc.nextInt();
			
			sum += score;
		}

		sc.close();
		
		System.out.printf("총 %d명의 학생의 총점은 %d점이고, 평균은 %.1f점이다.", students, sum, (double)sum/students);
	}
}

/* 5명
 * 1 홍길동 90
 * 2 장발장 78
 * 3 홍길순 99
 * 4 로미오 100
 * 5 줄리엣 79
 * 
 * 사람의 관점 - 점수를 전부 입력 받은 후 더함 -> sum = 90 + 78 + 99 + 100 + 79
 * 
 * 컴퓨터의 관점
 * 첫번째 값 입력 - 90 -> sum = 90
 * 두번째 값 입력 - 78 -> sum = 90 + 78
 * 세번째 값 입력 - 99 -> sum = 90 + 78 + 99
 * ...
 * 
 * 실시간으로 변수에 값을 저장함
 */
