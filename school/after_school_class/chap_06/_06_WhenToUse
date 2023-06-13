package chap_06;

public class _06_WhenToUse {

//	메소드 선언
	public static int getPower(int number, int exponent)
	{
//		number의 exponent 제곱(승)
		int result = 1;
		for (int i=0; i<exponent; i++)
		{
			result *= number;
		}
		return result;
	}
	
	// 메소드 오버로딩 (파라미터의 갯수)
	public static int getPower(int number)
	{
//		number의 제곱
		
//		int result = number * number;
//		return result;
		
//		메소드 안에서 다른 메소드를 호출할 수 있음 (코드의 재활용은 객체지향언어에서 굉장히 중요함!)
		return getPower(number, 2);
	}
	
	public static void main(String[] args) {
//		메소드가 필요한 이유
//		1. 반복되는 코드의 중복을 줄일 수 있음
		
//		2의 2제곱 구하기
		int result = 1;
		for (int i=0; i<2; i++)
		{
			result *= 2;
		}
		System.out.println("메인 메소드에서 코드 실행 " + result);
		
		System.out.println("메소드를 호출하여 실행 " + getPower(2, 2));
		
//		3의 3제곱 구하기
		result = 1;
		for (int i=0; i<3; i++)
		{
			result *= 3;
		}
		System.out.println("메인 메소드에서 코드 실행 " + result);
		
		System.out.println("메소드를 호출하여 실행 " + getPower(3, 3));
		
//		4의 2제곱 구하기
		result = 1;
		for (int i=0; i<2; i++)
		{
			result *= 4;
		}
		System.out.println("메인 메소드에서 코드 실행 " + result);
		
		System.out.println("메소드를 호출하여 실행 " + getPower(4, 2));
		
//		11의 제곱 구하기
		result = 1;
		for (int i=0; i<2; i++)
		{
			result *= 11;
		}
		System.out.println("메인 메소드에서 코드 실행 " + result);

		System.out.println("메소드를 호출하여 실행 " + getPower(11));
		
//		메소드를 사용하지 않으면 비슷한 작업을 할 때 겹치는 코드가 생기게 됨 (지금처럼 겹치는 코드가 적을 때는 큰 문제가 아니지만 겹치는 코드가 적을 때가 거의 없기 때문에 메소드를 사용함)
		
//		2. 수정사항이 발생할 시 수정하기 매우 편함
//		- 메인 메소드에서 코드로 실행 하였을 때는 100개, 1000개의 코드를 수정해야 할 때 100개, 1000개의 코드를 하나하나 수정해야 하므로 실수도 생길터이고 굉장히 오래 걸림
//		- 반면에 메소드를 호출해서 실행 하였을 때는 메소드 단 1개만 수정하면 되는 것이기 때문에 실수도 적고 단 시간에 수정 가능함
	}
}
