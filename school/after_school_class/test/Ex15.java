package test;

import java.util.Scanner;

public class Ex15 {

	// 직사각형의 넓이 구하기(메소드 이용)
	// main 메소드에서 area 메소드 호출 -> area 메소드에서 출력 X
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println( area( sc.nextInt(), sc.nextInt() ) );
		sc.close();
	}
	
	public static int area(int h, int v)
	{
		return h * v;
	}
}
