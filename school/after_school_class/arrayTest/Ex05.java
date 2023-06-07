package arrayTest;

import java.util.Scanner;

public class Ex05 {

	// 연도와 월을 입력받아서 해당 월의 날짜 수를 출력하다가 월 입력 때 0을 입력하면 종료하는 프로그램을 만드시오.
	// (월을 잘못 입력하면 "잘못 입력하였습니다."를 출력)
	public static void main(String[] args) {
		
		// 1단계 - 윤년을 판단하는 조건문을 만들기 
		// 1-1. 4년마다 돌아오는 해는 윤년이다.
		// 1-2. 단 4년마다 돌아오지만 100년 단위는 윤년이 아니다.
		// 1-3. 단 100년 마다 돌아오지만 400년 주기는 윤년이다.
		// 2단계 - 2월은 무조건 28일을 출력하는 프로그램 만들기
		// 3단계 - 윤년을 판단하여 2월을 28일과 29일을 구분하여 출력하는 프로그램 생성
		
		// 나의 풀이
		Scanner sc = new Scanner(System.in);
		
		int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
		
		while (true)
		{
			int year = sc.nextInt();
			int month = sc.nextInt();
			
			if (month == 0) break;
			
			
			else if (month == 2)
			{
				if (year%400==0 || (year%4==0 && year%100!=0)) // 년도가 400으로 나누어 떨어지면 무조건 윤년이기 때문에 400으로 나누어 떨어질 때 조건을 제일 앞에 씀 (시간 단축)
					System.out.println(days[month - 1] + 1);
				
				else System.out.println(days[month - 1]);
			}
			
			else if (year < 1 || year > 12) 
				{
					System.out.println("잘못 입력하였습니다.");
					continue;
				}
			
			else System.out.println(days[month - 1]);
		
		}	
		
		sc.close();
		
		// 선생님의 풀이 (import 및 main은 똑같으니 생략)
		
//		Scanner sc = new Scanner(System.in);
//		
//		// 1. 13칸 짜리 배열 생성 (1월의 날짜수는 0번 인덱스, 2월은 1번 ... 이면 살짝 헷갈리기 때문)
//		int day[] = new int[13];
//		int year, month;
//		
//		// 2. 배열의 날짜의 수에 해당하는 데이터를 할당함 (단 0번 인덱스는 비워 둬야함! : 배열을 13칸 짜리로 생성했기 때문)
//		for (int i=1; i<day.length; i++) // 1 ~ 12까지 반복
//		{
//			if (i == 2) day[i] = 28;
//			
//			else if (i==4|| i==6 || i==9 || i==11)
//				day[i] = 30;
//			
//			else day[i] = 31;
//		}
//		
//		// 값이 제대로 할당 되었는지 확인
//		// for (int i=0; i<day.length; i++)
//		//     System.out.println(i + ", "  + day[i]);
//		
//		// 무한 반복문을 돌리면 연과 월을 입력받아 날짜를 출력
//		while (true)
//		{
//			// 3-1. 연과 월을 입력받기
//			System.out.print("년도 : ");
//			year = sc.nextInt();
//			
//			System.out.print("월 : ");
//			month = sc.nextInt();
//			
//			// 3-2. 무한 반복을 종료하는 방법
//			if (month == 0) break;
//			
//			// 월을 잘못 입력했을 때 예외처리 (값의 범위가 정해져 있을 경우)
//			if (month < 1 || month > 12)
//			{
//				System.out.println("잘못 입력했습니다. 월은 1부터 12까지의 중수 중 하나를 쓰셔야 합니다.");
//				continue;
//			}
//			
//			// 윤년 처리
//			if (month ==2) // 2월 일때만 윤년이 의미가 있어짐
//			{
//				if (year%400==0 || ((year%4==0) && (year%100!=0))) // 윤년의 조건을 만족하면
//					day[2] = 29; // 2월의 날짜 수를 29로 만들어줌
//				
//				else // 윤년의 조건을 만족시키지 못하면 
//					day[2] = 28; // 2월의 날짜 수를 28로 만들어줌
//			}
//
//			// 모든 조건 (윤년 제외)을 만족할 때 출력하기
//			System.out.printf("입력한 달의 날짜 수는 %d일 입니다.\n", day[month]);
	}
}
