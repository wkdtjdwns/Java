package test;

import java.util.Scanner;

public class Ex16 {

	// 두 개의 정수를 입력받고 사칙연산을 선택함 (+, -, *, /)
	// add, minus, multi, div 메소드를 만들어서 main 메소드에서 실행 -> 각 메소드에서 실행 X
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번 째 숫자 >>> ");
		int num1 = sc.nextInt();
		
		System.out.print("두번 째 숫자 >>> ");
		int num2 = sc.nextInt();
		
		System.out.print("사칙연산 (+, -, *, /) >>> ");
		String type = sc.next();
		
		// 변수 이용 X
		switch (type)
		{
			case "+":
				System.out.printf("%d + %d = ", num1, num2);
				System.out.println( add(num1, num2) );
				break;

			case "-":
				System.out.printf("%d - %d = ", num1, num2);
				System.out.println( minus(num1, num2) );
				break;

			case "*":
				System.out.printf("%d * %d = ", num1, num2);
				System.out.println( multi(num1, num2) );
				break;

			case "/":
				System.out.printf("%d / %d = ", num1, num2);
				System.out.println( div(num1, num2) );
				break;
				
			default:
				System.out.println("사칙연산은 (+, -, *, /) 만 존재합니다.");
				break;
		}
		
		sc.close();
		
		// 변수 이용
		double result = 0.0;
		
		switch (type)
		{
			case "+":
				result = add(num1, num2);
				break;
		
			case "-":
				result = minus(num1, num2);
				break;
		
			case "*":
				result = multi(num1, num2);
				break;
		
			case "/":
				result = div(num1, num2);
				break;
			
			default:
				System.out.println("사칙연산은 (+, -, *, /) 만 존재합니다.");
				break;
		}
		
		System.out.printf("%d %s %d = %.1f", num1, type, num2, result);
	}
	
	// 사칙연산 메소드
	public static int add(int num1, int num2)
	{
		return num1 + num2;
	}

	public static int minus(int num1, int num2)
	{
		return num1 - num2;
	}

	public static int multi(int num1, int num2)
	{
		return num1 * num2;
	}

	public static double div(double num1, double num2)
	{
		return num1 / num2;
	}
}
