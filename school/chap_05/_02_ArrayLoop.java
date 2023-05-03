package chap_05;

public class _02_ArrayLoop 
{
	public static void main(String[] args) 
	{
		// 배열순회 - 순차적으로 배열의 값을 모두 돌아봄
		
		String[] coffees = {"아메리카노", "카페모카", "라떼", "카푸치노"};
		
		// i값 = 0 -> 1 -> 2 -> 3
		// i값이 배열의 크기보다 클 때 멈춤 (직접 세서 적음)
		for (int i=0; i<4; i++) 
		{
			System.out.println(coffees[i] + " 하나"); // coffees 배열의 0, 1, 2, 3번 인덱스 값을 출력함
		}
		System.out.println("주세요!");
		
		System.out.println("===========");
		
		System.out.println(coffees.length); // coffees 배열의 길이를 출력
		
		System.out.println("===========");
		
		// 더 간단히
		// i값이 배열의 크기보다 클 때 멈춤 (직접 세지 않고도 적을 수 있음)
		for (int i=0; i<coffees.length; i++) 
		{
			System.out.println(coffees[i] + " 하나"); // 똑같이 coffees 배열의 0, 1, 2, 3번 인덱스 값을 출력함
		}
		System.out.println("주세요!");
		
		System.out.println("===========");
		
		// 좀 더 간단히
		// for-each 반복문
		for (String coffee : coffees) 
		// 새로 만든 String 타입의 coffee 변수에 배열 coffees에 있는 값(String 타입)을 배열 coffees의 길이 만큼을 대입함
		{
			System.out.println(coffee + " 하나");
		}
		System.out.println("주세요!");
		
		System.out.println("===========");
		
		double[] data = new double[5];
		
		// data 배열의 길이는 5지만 할당된 값은 3개임
		data[0] = 10.0;
		data[1] = 12.9;
		data[2] = 10.3;
		
		for (int i=0; i<data.length; i++) 
		{
			// 할당하지 않은 인덱스 값은 double의 기본 값인 0.0이 출력됨
			System.out.println(data[i]);
		}
		
		System.out.println("===========");
		
		// 내가 할당한 값만 출력하기
		int cnt = 0;
		// 내가 값을 할당시키면 늘어날 변수
		data[0] = 10.0; cnt++;
		data[1] = 12.9; cnt++;
		data[2] = 10.3; cnt++;
		
		for (int i=0; i<cnt; i++)
			// 내가 값을 할당시키면 늘어난 변수이기 때문에 배열의 길이와 상관없이 내가 할당한 값만 나옴
		{
			System.out.println(data[i]);
		}
	}
}
