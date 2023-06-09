package chap_06;

public class _05_Overloading {

	// 메소드 이름을 지을 때 보통 get을 사용함 (이 메소드를 실행하면 어떠한 값을 얻는다는 의미)
	public static int getPower(int num) // num -> Parameter 또는 매개변수라고 부름
	{
		// 전달 받은 값의 제곱 구하기
		int result = num * num;
		
		return result;
	}
	
	// 파라미터 변수의 이름과는 관계없이 이름 및 파라미터의 데이터타입, 갯수가 같으면 메소드 오버로딩이 불가능함
//	public static int getPower(int num1)
//	{
//		int result = num * num;
//	
//		return result;
//	}
	
	// int 형의 num 파라미터와 달리 String 형의 strNum 파라미터로 정의 했기 때문에 메소드 오버로딩이 가능함
	public static int getPower(String strNum)
	{
		int num = Integer.parseInt(strNum);
		
		int result = num * num;
		
		return result;
	}
	
	// num의 exp제곱 구하기 
	// num = 4, exp = 3 -> 4의 3제곱 = 64
	
	// 위에 있는 메소드들과 달리 파라미터의 갯수가 2개이기 때문에 메소드 오버로딩이 가능함
	public static int getPower(int num, int exp) // num, exp를 모두 Parameter로 정할 수 있음 
	{
		// 전달받은 값을 사용해서 연산하기
		int result = 1;
		
		for (int i=0; i<exp; i++)
		{
			result *= num;
		}

		return result;
	}
	
	public static void main(String[] args) {
		// 메소드 오버로딩 : 같은 이름의 메소드를 여러번 선언하는 것
		
		// 메소드 오버로딩의 조건
		// 1. 파라미터의 타입이 다르다.
		// 2. 파라미터의 갯수가 다르다.
		
		// getPower(int num)
		System.out.println(getPower(5));
		
		// getPower(String strNum)
		System.out.println(getPower("7"));
		
		// getPower(int num, int exp)
		System.out.println(getPower(4, 3));

		// println()도 오버로딩의 예 라고 볼수 있음 (파라미터의 데이터타입이 다름)
		// 모두 다 똑같이 println()이라는 이름의 메소드이지만 정상적으로 출력됨
		System.out.println();     // 파라미터가 없는 형태
		System.out.println(1);    // Int (Short / Long) 형
		System.out.println('a');  // Char 형
		System.out.println("AB"); // String 형
		System.out.println(true); // Bool 형
		System.out.println(3.14); // Double (Float) 형
	}
}
