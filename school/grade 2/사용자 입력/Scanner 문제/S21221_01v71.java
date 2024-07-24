package S21221_00;

//Scanner를 사용하기 위한 import
import java.util.Scanner;

public class S21221_01v71 {

	public static void main(String[] args) {
		
		String in_string;
		
		// Ctrl + Shift + O를 눌러서 import함 -> 단축키
		Scanner sc = new Scanner(System.in);
		
		while (true)
		{
			System.out.print("문자열을 입력하시오. >>> ");
			in_string = sc.nextLine();
			
			System.out.printf("입력한 문자열은 : \"%s\"입니다.\n", in_string);
			
			if (in_string.equals("q")) break;
		}
		
		sc.close();
		System.out.println("종료");
	}
}

/*
실행 결과
-----------------------------------
문자열을 입력하시오. >>> 안녕 세상아
입력한 문자열은 : "안녕 세상아"입니다.
문자열을 입력하시오. >>> 3일연애
입력한 문자열은 : "3일연애"입니다.
문자열을 입력하시오. >>> q
입력한 문자열은 : "q"입니다.
종료
*/
