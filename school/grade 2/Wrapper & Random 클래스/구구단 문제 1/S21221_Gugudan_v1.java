package S21221_00;

import java.util.*;

public class S21221_Gugudan_v1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x, y;
		
		Random ran = new Random();
		
		// 랩퍼 크래스를 이용하여 int형으로 형변환
		x = Math.abs(ran.nextInt() % 9) + 1;
		y = Math.abs(ran.nextInt() % 9) + 1;
		
		int num = x * y;
		
		System.out.println();
		System.out.printf("* 구구단 %d단에 대한 문제입니다\n", x);
		System.out.println();
		
		System.out.printf("%d * %d  = ", x, y);
		
		int answer = sc.nextInt();
		
		if (answer == num) {
			System.out.println("정답입니다!");
		} else {
			System.out.println("오답입니다!");
			System.out.printf("정답은 %d입니다!", num);
		}
		
		sc.close();
	}
}

/*
실행 결과
----------------------------

* 구구단 6단에 대한 문제입니다

8 * 2  = 16
정답입니다!
*/
