package chap_06;

import java.util.Scanner;

public class _Prog_Calculator {

	// 정수 2개를 입력받고 연산자 종류(+,-,*,/)를 입력받은 다음 입력받은 대로 연산하는 프로그램을 만드시오.
	
	public static int plus(int num1, int num2)
	{
		return num1 + num2;
	}
	
	public static int minus(int num1, int num2)
	{
		return num1 - num2;
	}
	
	public static int multiple(int num1, int num2)
	{
		return num1 * num2;
	}
	
	public static double divide(int num1, int num2) // 나누기는 double 값으로 리턴 해야함 
	{
		// 예외 처리 (0으로는 나눌 수 없음)
		if (num2 == 0) 
		{
			System.out.println("0으로 나눌 수 없습니다.");
		}
		return (double)num1 / num2;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 값 입력받기
		System.out.print("첫번째 수 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두번째 수 : ");
		int num2 = sc.nextInt();
		
		System.out.print("연산자 종류(+,-,*,/) : ");
		String oper = sc.next();
		
		sc.close();
		
		// 연산자의 종류에 따라서 연산 방식 바꾸기
		switch (oper) 
		{
			case "+":
				System.out.println(plus(num1, num2));
				break;
			case "-":
				 System.out.println(minus(num1, num2));
				 break;
			case "*":
				 System.out.println(multiple(num1, num2));
				 break;
			case "/":
				 System.out.println(divide(num1, num2));
				 break;
			default:
				System.out.println("잘못된 연산자입니다.");
		}
	}
}
