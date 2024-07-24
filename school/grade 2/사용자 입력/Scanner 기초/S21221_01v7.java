package S21221_00;

import java.util.Scanner;

public class S21221_01v7 {

	public static void main(String[] args) {
		
		int int_val;
		double dou_val;
		String str_val;
		
		// Ctrl + Shift + O를 눌러서 import함 -> 단축키
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1. 문장을 입력하시오. >>> ");
		str_val = sc.nextLine();
		
		System.out.print("2. 정수를 입력하시오. >>> ");
		int_val = sc.nextInt();
		
		System.out.print("3. 실수를 입력하시오. >>> ");
		dou_val = sc.nextDouble();
		
		System.out.println();
		
		System.out.printf("1. 입력한 문장은 \"%s\"입니다.\n", str_val);
		System.out.printf("2. 입력한 정수는 \"%d\"입니다.\n", int_val);
		System.out.printf("3. 입력한 실수는 \"%f\"입니다.\n", dou_val);
		
		sc.close();
	}
}

/*
실행 결과
------------------------------------
1. 문장을 입력하시오. >>> 안녕 세상아!
2. 정수를 입력하시오. >>> 333
3. 실수를 입력하시오. >>> 3.141592

1. 입력한 문장은 "안녕 세상아!"입니다.
2. 입력한 정수는 "333"입니다.
3. 입력한 실수는 "3.141592"입니다.
*/
