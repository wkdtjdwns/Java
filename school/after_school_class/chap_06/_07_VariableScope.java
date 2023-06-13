package chap_06;

public class _07_VariableScope {

	public static void methodA(int number)
	{
		System.out.println("A메소드에서 출력 : " + number);
		
//		System.out.println(result); result라는 변수는 해당 메소드(methodA)에서는 찾을 수 없기 때문에 오류가 생김
	}
	
	public static void methodB()
	{
		int result  = 1; // 지역변수 (해당 메소드 안에서만 사용 가능함 -> 다른 메소드에서 사용하면 오류가 생김)
		                 // 하나의 지역은 중괄호({ })사이를 의미함
	}
	
	public static void main(String[] args) {
		
		int number = 3;  // 이 상태에서 실행하면 3이 출력되지 않음 (해당 변수는 메인 메소드에서만 사용 가능함)
		methodA(number); // 이렇게 하면 출력이 가능하긴 함 (호출했기 때문) 하지만 직접적인 참조는 불가능함
		
		for (int i=1; i<=5; i++)
		{
			System.out.println(i);
		}
		
//		System.out.println(i); 변수 i는 for문에서 선언한 지역변수이기 때문에 for문에서만 사용가능함 -> 오류가 생김
		
//		초기화 블록
		{
			int j = 0;
			System.out.println(j);
			System.out.println(number);
		}
		
//		System.out.println(j); 변수 j도 초기화 블록에서 선언한 지역변수 -> 오류가 생김
	}
}
