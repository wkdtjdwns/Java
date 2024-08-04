package S21221_00;

import java.util.*;

public class S21221_Gugudan_v3 {

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
			 System.out.printf("정답은 %d입니다!\n", num);
			 
		 }
		 
		 System.out.println("입력된 데이터는 아래와 같습니다");
		 System.out.println("------------------------------------");
		 
		 for (int i = 0; i < args.length; i++) {
			 System.out.printf("args[%d] : %s\n", i, args[i]); 
		 }
		 
		 sc.close();
		 
		 //22 장성준 "2024년 04월 08일 (토) 12시 47분" "학교 교실에서 이 좋은 날에.....^^" "이클립스도 보고 노션도 보고 구글 클래스룸도 보다"
	}
}

/*
실행 결과
-----------------------------------------------------------

* 구구단 8단에 대한 문제입니다

8 * 9  = 72
정답입니다!
입력된 데이터는 아래와 같습니다
------------------------------------
args[0] : 8
args[1] : 장성준
args[2] : 2024년 04월 08일 (토) 12시 47분
args[3] : 학교 교실에서 이 좋은 날에.....^^
args[4] : 이클립스도 보고 노션도 보고 구글 클래스룸도 보다
*/
