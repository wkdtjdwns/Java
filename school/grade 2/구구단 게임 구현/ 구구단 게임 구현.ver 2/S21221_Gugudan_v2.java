package S21221_00;

import java.util.*;

public class S21221_Gugudan_v2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x, y;
		
		Random ran = new Random();
		
		// args의 길이를 확인해 0이면 랜덤, 아니면 args의 요소를 가져옴
		if (args.length == 0) {
			x = Math.abs(ran.nextInt() % 9) + 1;
		}
		else {
			// args는 String형 배열이기 때문에 int형으로 변환함
			x = Integer.parseInt(args[0]);
		}
			
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
------------------------------

* 구구단 3단에 대한 문제입니다

3 * 6  = 18
정답입니다!
*/
