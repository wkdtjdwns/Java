package games;

import java.util.Scanner;

public class BassBall {

	// 1 ~ 9까지의 수 중에서 랜덤으로 3개의 수를 감춤
//	예시 정답 : 4 8 6
//	예시 입력 : 1 8 4
	
//	예시 출력 : 1스트라이크 1볼 (스트라이크 = 숫자&자리 맞춤 / 볼 = 숫자만 맞춤)

//	예시 입력 : 4 8 3
//	예시 출력 : 2스트라이크 (스트라이크 = 숫자&자리 맞춤 / 볼 = 숫자만 맞춤)
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 랜덤으로 뽑은 3자리의 수를 저장하기 위한 배열 randomNum 생성
		int[] randomNum = new int[3];
		
		// 유저가 입력한 수를 저장하기 위한 배열 userNum 생성
		int[] userNum = new int[3];
		
		// 배열의 인덱스 이용 (숫자가 같긴 한데 인덱스까지 같으면 스트라이크 아니면 볼)
		
		// 스트라이크 및 볼의 갯수를 저장하기 위한 변수
		int strike = 0;
		int ball = 0;
		
		// 시도 횟수를 알려주기 위한 변수
		int cnt = 0;
		
		// 1단계 : randomNum에 반복문을 이용해서 랜덤한 3개의 수 할당
		for (int i=0; i<randomNum.length; i++)
		{
			randomNum[i] = (int)(Math.random() * 9 + 1);
			
			// 2단계 : 1단계에서 할당한 수 3개를 모두 다른 정수로 만들기
			for (int j=0; j<i; j++) // j = i - 1
			{
				if (randomNum[j] == randomNum[i])
				{
					i--; // 바깥쪽 반복을 다시 돌리게 함
					break;
				}
			}
		}

		// 랜덤값 확인
//		for (int num : randomNum)
//		{
//			System.out.print(num + " ");
//		}
//		
//		System.out.println();
		
		while (true) 
		{
			cnt++;
			System.out.println(cnt + "번 째 시도");
			// user의 입력값 처리
			for (int i=0; i<userNum.length; i++)
			{
				System.out.print((i+1) + "번 째 수를 입력하세요 >> ");
				userNum[i] = sc.nextInt();
				
				for (int j=0; j<i; j++)
				{
					if (userNum[j] == userNum[i])
					{
						System.out.print("중복된 입력입니다. 다시 ");
						
						i--;
						break;
					}
				}
			}
			
			// randomNum과 userNum을 비교하는 코드
			// 3칸짜리 배열 randomNum과 userNum을 비교하기
			// 전체를 비교하면서 같은 숫자가 있는 지 확인
			// 같은 숫자가 있으면 인덱스 값도 같은 지 확인 (같으면 스트라이크 다르면 볼)
			for (int i=0; i<randomNum.length; i++)
			{
				for (int j=0; j<userNum.length; j++)
				{
					if (randomNum[i] == userNum[j])
					{
						if (i == j)
						{
							strike++;
							break;
						}
						
						else
						{
							ball++;
							break;
						}
					}
				}
			}
			
			
			// 비교한 결과를 안내해주는 코드
			System.out.println(strike + "스트라이크, " + ball + "볼");
			
			
			// 정답을 맞추었을 때 무한루프를 벗어나는 코드
			if (strike == 3)
			{
				System.out.println(cnt + "회의 시도 끝에 정답!!!");
				break;
			}
			
			// 정답이 아니면 스트라이크, 볼값 초기화
			else
			{
				strike = 0;
				ball = 0;
			}
		}
		
		sc.close();
	}
}
