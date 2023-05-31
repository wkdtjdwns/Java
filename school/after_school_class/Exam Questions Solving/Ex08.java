package exam;

import java.util.Scanner;

public class Ex08 {
//  1부터 시작하여, 3과 6과 9에서 박수를 치는 3, 6, 9 게임을 하려고 한다.
//  40번까지 진행을 하였을 때 총 몇번의 박수를 쳤는지 구하시오.
//  (예를 들어 13은 박수 한 번 "짝" 이며 33, 36, 39는 박수 두 번 "짝짝" 이다.
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		sc.close();
		int cnt = 0;
		
		for (int i=1; i<= num; i++) {
			int q = i / 10; // 몫 (3, 6, 9면 박수침)
			int r = i % 10; // 나머지 (3, 6, 9면 박수침)
			
			if (q == 3 || q == 6 || q == 9) {   // 30, 60, 90대이면
				if (r == 3 || r == 6 || r == 9) {
					System.out.print("짝");     // 1의 자리를 판단하여 박수를 치면서
					cnt++;
				}
				System.out.println("짝");       // 적어도 1번은 박수를 치고
				cnt++;
			} else {                           // 30, 60, 90대가 아니면
				if (r == 3 || r == 6 || r == 9) {
					System.out.println("짝");   // 1의 자리만 판단하여 박수를 침
					cnt++;
				} else System.out.println(i);
			}
		}
		
		System.out.println("총 박수를 친 횟수는 " + cnt);
	}
}
