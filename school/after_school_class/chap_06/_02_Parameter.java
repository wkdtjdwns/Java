package chap_06;

public class _02_Parameter {
	
	// 전달값이 있는 메소드 (power는 원래 있는 메소드지만 구현하는 것임 / 전달 받은 값의 제곱을 구해줌)
	
	// 전달값 정하는 법 -> 메소드 이름(데이터타입 변수명)
	public static void power(int num) // num -> Parameter 또는 매개변수라고 부름
	{
		// 전달 받은 값의 제곱 구하기
		int result = num * num;
		
		// void 즉, return 값이 없기 때문에 위에서 구한 값을 출력하게 함
		System.out.println(num + "의 2제곱은 " + result);
	}
	
	// num의 exp제곱 구하기 
	// num = 4, exp = 3 -> 4의 3제곱 = 64
	public static void powerByExp(int num, int exp) // num, exp를 모두 Parameter로 정할 수 있음 
	{
		// 전달받은 값을 사용해서 연산하기
		int result = 1;
		
		for (int i=0; i<exp; i++)
		{
			result *= num;
		}

		// void 즉, return 값이 없기 때문에 위에서 구한 값을 출력하게 함
		System.out.println(num + "의 " + exp + "제곱은 " + result);
	}

	public static void main(String[] args) { // 위에서 정의한 메소드들을 호출하기 위한 main 메소드
		
		// 메소드 호출 시 주의할 점!!
		
		// Parameter에 int형 변수 num을 사용했는데
		// power(); 와 같이 인자 값인 num의 값을 지정해 주지 않거나
		// power(3.14); 와 같이 위에서 정의한 변수형이 아닌 인자 값을 사용하면 오류가 생김!
		
		// 메소드 호출
		power(5); // 5 -> Argument, 인수, 인자
		power(9); // 9 -> Argument, 인수, 인자
		
		powerByExp(4, 7); // 4, 7 -> Argument, 인수, 인자
		powerByExp(4, 0); // 모든 수의 0승(제곱) = 1
	}
}
