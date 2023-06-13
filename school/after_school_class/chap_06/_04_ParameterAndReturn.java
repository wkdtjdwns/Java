package chap_06;

public class _04_ParameterAndReturn {

	// 메소드 이름을 지을 때 보통 get을 사용함 (이 메소드를 실행하면 어떠한 값을 얻는다는 의미)
	public static int getPower(int num) // num -> Parameter 또는 매개변수라고 부름
	{
		// 전달 받은 값의 제곱 구하기
		int result = num * num;
		
		return result;
	}
	
	// num의 exp제곱 구하기 
	// num = 4, exp = 3 -> 4의 3제곱 = 64
	public static int getPowerByExp(int num, int exp) // num, exp를 모두 Parameter로 정할 수 있음 
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
		
		// 변수 생성 후 출력
		int val = getPower(5);
		System.out.println(val);
		
		val = getPowerByExp(4, 3);
		System.out.println(val);
		
		// 변수 생성 없이 출력
		System.out.println(getPower(7));
		
		System.out.println(getPowerByExp(2, 4));
	}
}
