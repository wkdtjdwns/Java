package test;

public class Ex06_1 {

	// 메소드를 사용해서 팩토리얼 계산기 만들기
	
	public static void main(String[] args) {
		 
		int result = factorial(5);
		
		System.out.println(result);
	}
	
	public static int factorial(int num)
	{
		
		if (num == 1)
			return 1;
		
		// 자기 자신을 불러옴 -> 재귀 함수
		return num * factorial(num-1);
		
		// factorial(5)
		// -> 5 * factorial(4)
		// -> 5 * 4 * factorial(3)
		// -> 5 * 4 * 3 * factorial(2)
		// -> 5 * 4 * 3 * 2 * factorial(1)
		
		// factorial(1) = 1
		// -> 5 * 4 * 3 * 2 * 1 -> 120
	}
}
