package S21221_00;

public class S21221_01v4 {

	public static void main(String[] args) {
	
		int x = 1;
		int y = 2;
		
		// 원래는 0.5인데 출력은 0.0이됨
		// int형을 double형으로 자동 형변환 후에 연산을 하기 때문에 연산이 더 들어가 버려서 0.0이 되어버림
		double result_0 = x / y;
		
		// 0.5로 출력하는 방법
		
		// 1. 1개의 변수 앞에 (double)를 사용해 형변환
		double result_1 = (double)x / y;
		
		// 2. 다른 1개의 변수 앞에 (double)을 사용해 형변환
		double result_2 = x / (double)y;
		
		// 3. 2개의 변수 앞에 모두 (double)을 사용해 형변환
		double result_3 = (double)x / (double)y;
		
		System.out.println("result_0 : " + result_0);
		System.out.println("result_1 : " + result_1);
		System.out.println("result_2 : " + result_2);
		System.out.println("result_3 : " + result_3);
	}
}

/*
실행 결과
--------------
result_0 : 0.0
result_1 : 0.5
result_2 : 0.5
result_3 : 0.5
*/
