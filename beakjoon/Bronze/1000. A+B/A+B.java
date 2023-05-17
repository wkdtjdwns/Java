// Scanner 의 첫 단어는 대문자로 써준다.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		
	// Scanner 객체명 = new Scanner(System.in);
	Scanner in = new Scanner(System.in);
		
	// 보통 가장 많이쓰이는 객체명으로는 in 과 scan, sc 을 쓴다.
	// Scanner(System.in) 에서 System.in 은 입력한 값을 Byte 단위로 읽는 것을 뜻한다. 
		
	// 오류 생길 때
	// in.nextInt() 에 int 자료형 범위를 넘어가는 수를 입력하거나, 문자를 입력하는 경우.
	// in.nextBoolean() 에 "True (true, TRUE)" , False (false, FALSE) 같은 boolean 자료형 외의 문자, 숫자를 입력하는 경우.
		
	// String 입력 방법
		
	// in.next() => 문자열 입력시 공백 전 까지만 받음
	// in.nextLine() => 문자열 입력시 Enter 입력 전까지만 받음
	// 대부분 문제에서는 행 단위로 입력받는 일이 다수이니 문자열 입력 형태로는 in.nextLine() 을 쓴다.
		
	// 숫자형 즉, int형을 입력하기 때문에 next"Int"()를 사용함
		
	int A, B;
	A = in.nextInt();
	B = in.nextInt();
		
	in.close();
		
	System.out.println(A + B);	
    }
}
