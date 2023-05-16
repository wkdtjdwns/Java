package chap_01;

public class _09_Ex {
	public static void main(String[] args) {
		int x = 5;
		int y = 2;

		/* x와 y의 값 바꾸기
		 * x = 2
		 * y = 5
		 */
		
		// 임시로 변수 만들기
		int temp = x; // temp = 5
		x = y; // x = 2
		y = temp; // y = 5
	
		// Ctrl + Alt + 아래 화살표 => 명령어 바로 아래로 복사
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		
		// 변수 2개로 만들기
		int X = 5;
		int Y = 2;
		
		X += Y; // X = 5 + 2 = 7
		Y = X - Y; // Y =  7 - 2 = 5	
		X -= Y; // X = 7 - 5 = 2
		
		System.out.println("X = " + X);
		System.out.println("Y = " + Y);		
	}
}
