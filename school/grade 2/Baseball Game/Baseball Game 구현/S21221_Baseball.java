package S21221_00;

import java.util.*;
import java.io.*;

public class S21221_Baseball {

	public static int playGame() throws IOException {
		
		int x, y, z;
		
		Random r = new Random();
		x = Math.abs(r.nextInt() % 9) + 1;
		
		// 난수끼리의 중복 제거
		do {
			y = Math.abs(r.nextInt() % 9) + 1;
		} while (y == x);
		
		do {
			z = Math.abs(r.nextInt() % 9) + 1;
		} while ( (z == x) || (z == y) );
		
		System.out.println(x + ", " + y + ", " + z);
		return playGame(x, y, z);
	}
	
	public static int playGame(int x, int y, int z) throws IOException {
		int count;
		int strike, ball;
		int[] usr = new int[3];
		int[] com = { x, y, z };
		
		System.out.println("숫자 야구 게임");
		count = 0;
		
		do {
			count++;
			
			do {
				System.out.println("\n카운트: " + count);
				
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				String user;
				
				// 키보드로 입력된 숫자들을 입력받아 배열에 저장함.
				System.out.print("1번째 숫자: ");
				user = br.readLine();
				usr[0] = new Integer(user).intValue();
				
				System.out.print("2번째 숫자: ");
				user = br.readLine();
				usr[1] = new Integer(user).intValue();
				
				System.out.print("3번째 숫자: ");
				user = br.readLine();
				usr[2] = new Integer(user).intValue();
				
				// 입력된 숫자 유효성 검사 (1 ~ 9 범위 및 입력된 숫자가 서로 다른지 검사 오류 시 재출력)
				if ( (usr[0] < 1) || (usr[1] < 1) || (usr[2] < 1) ) {
					System.out.println("1보다 작은 값은 입력하지 마세요. 다시 입력해주세요.");
				}
				
				else if ( (usr[0] > 9) || (usr[1] > 9) || (usr[2] > 9) ) {
					System.out.println("1부터 9까지의 숫자 중 하나를 입력해주세요. 다시 입력해주세요.");
				}
				
				else if ( (usr[0] == usr[1]) || (usr[1] == usr[2]) || (usr[0] == usr[2]) ) {
					System.out.println("모두 다른 숫자를 입력해주세요. 다시 입력해주세요.");
				}
				
			} while ( (usr[0] < 1) || (usr[1] < 1) || (usr[2] < 1) 
					|| (usr[0] > 9) || (usr[1] > 9) || (usr[2] > 9)
					|| (usr[0] == usr[1]) || (usr[1] == usr[2]) || (usr[0] == usr[2]) );
			
			strike = ball = 0;
			
			// 입력된 숫자와 난수로 저장된 숫자를 순서에 맞추어서 비교함.
			// 순서와 숫자가 같은 경우 strike 카운트
			// 순서는 틀리고 같은 숫자가 있는 경우 ball 카운트
			if (usr[0] == com[0]) {
				strike++;
			}
			
			if (usr[1] == com[1]) {
				strike++;
			}
			
			if (usr[2] == com[2]) {
				strike++;
			}
			
			if (usr[0] == com[1]) {
				ball++;
			}
			
			if (usr[0] == com[2]) {
				ball++;
			}
			
			if (usr[1] == com[0]) {
				ball++;
			}
			
			if (usr[1] == com[2]) {
				ball++;
			}
			
			if (usr[2] == com[0]) {
				ball++;
			}
			
			if (usr[2] == com[1]) {
				ball++;
			}
			
			System.out.println("Strike: " + strike + " Ball: " + ball);
			
		} while ( (strike < 3) && (count < 11) );
		
		return count;
	}
	
	public static void main(String[] args) throws IOException {
		int result;
		
		if (args.length == 3) {
			int x = Integer.valueOf(args[0]).intValue();
			int y = Integer.valueOf(args[1]).intValue();
			int z = Integer.valueOf(args[2]).intValue();
			
			result = playGame(x, y, z);
		}
		
		else {
			result = playGame();
		}
		
		if (result <= 2) {
			System.out.println("참 잘했어요!");
		}
		
		else if (result <= 5) {
			System.out.println("잘했어요!");
		}
		
		else if (result <= 9) {
			System.out.println("보통이네요!");
		}
		
		else {
			System.out.println("분발하세요!");
		}
	}
}

/*
실행 결과
-------------------
9, 3, 4
숫자 야구 게임

카운트: 1
1번째 숫자: 3
2번째 숫자: 4
3번째 숫자: 9
Strike: 0 Ball: 3

카운트: 2
1번째 숫자: 9
2번째 숫자: 4
3번째 숫자: 3
Strike: 1 Ball: 2

카운트: 3
1번째 숫자: 9
2번째 숫자: 3
3번째 숫자: 4
Strike: 3 Ball: 0
잘했어요!

*/
