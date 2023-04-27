package chap_05;

public class _01_Array 
{
	public static void main(String[] args) 
	{
		// 배열 : 같은 자료형의 여러개의 값을 저장하는 연속된 공간
		//		 자료를 순차적으로 관리하는 구조
		
		// 학생 100명의 ID를 부여하려고 함
		int stuId01 = 11101;
		int stuId02 = 11102;
		int stuId03 = 11103;
		
		// ......
		
		int stuId100 = 31530;
		
		// 이렇게하면 100개의 자료가 각각의 위치로 흩어져서 저장 됨
		
		// int[] stuId 도 가능
		int stuId[] = new int[100]; // 100개의 int형 배열을 선언함
		// 이렇게 배열을 사용하면 모든 ID의 주소가 모여있음
		
		// 값 할당하기
		stuId[0] = 11101; //stuId의 1번째 값에 11101 을 넣음
		stuId[1] = 11102; //stuId의 2번째 값에 11102 을 넣음
		
		// .....
		
		stuId[99] = 31530; //stuId의 99번째 값에 31530 을 넣음
		// 하지만 이렇게 해도 별 차이가 없어보이는게 사실임
		
		// 허나 배열 하나에 100개의 값을 넣는게 변수 100개를 만드는 것보다 실행속도가 빠를 뿐더러
		
		// 그렇지만 배열의 진가는 반복문과 있어야 한다
		
		/*
		String coffeeRose = "아메리카노";
		String coffeeRachel = "카페모카";
		String coffeeChandler = "라떼";
		String coffeeMonica = "카푸치노";
		
		System.out.println(coffeeRose + "하나");
		System.out.println(coffeeRachel + "하나");
		System.out.println(coffeeChandler + "하나");
		System.out.println(coffeeMonica + "하나");
		System.out.println("주세요!");
		
		위처럼 긴 코드를 배열로 쉽게 처리할 수 있다
		*/
		
		// 배열 선언 첫 번째 방법
		
		
		// 데이터타입 변수이름[] = new 데이터타입[배열의 크기]
		// 데이터타입[] 변수이름 = new 데이터타입[배열의 크기]
		// 배열은 선언할 때 크기가 무조건 정해저야 함
		
		String[] coffees = new String[4]; // 크기가 4인 coffees 라는 이름의 리스트를 만듬
		// String coffees[] = new String[4];
		
		// 선언된 배열의 값 항당하기
		coffees[0] = "아메리카노";
		coffees[1] = "카페모카";
		coffees[2] = "라떼";
		coffees[3] = "카푸치노";
		
		// 배열 선언 및 할당 (동시에)
		String[] coffees2 = new String[] {"아메리카노", "카페모카", "라떼", "카푸치노"};
		
		// String[] coffees3 = new String[4] {"아메리카노", "카페모카", "라떼", "카푸치노"};
		// 선언과 할당을 동시에 할 때는 배열의 크기를 알려주면 오류가 뜸
		
		// 배열 선언 및 할당 2
		String[] coffees4 = {"아메리카노", "카페모카", "라떼", "카푸치노"};
		
		// 출력하기
		
		// 배열이름[인덱스 값]
		System.out.println(coffees[0]);
		System.out.println(coffees[1]);
		
		// 라떼 -> 에스프레소
		coffees[2] = "에스프레소";
		
		System.out.println(coffees[2]);
		System.out.println(coffees[3]);
		System.out.println("주세요!");
		
		// 배열 선언 및 할당시 주의점!
		
		// 배열의 데이터 타입과 이름만 선언은 가능함
		// 단, 타입과 이름만으로 선언한 경우 값을 할당할 때, new String[] 을 생략할 수 없음
		
		String[] coffees5; // 정상 작동
		// coffees5 = {"아메리카노", "카페모카", "라떼", "카푸치노"}; // 오류가 뜸
		coffees5 = new String[] {"아메리카노", "카페모카", "라떼", "카푸치노"}; // 정상 작동
		
		// 다른 자료형의 배열
		
		int[] i = new int[3];
		i[0] = 3;
		i[1] = 7;
		i[2] = 9;
		/* 
		 * i[3] = 10;
		 * i[4] = 15;
		 * 
		 * 배열의 크기를 넘어가서 오류가 뜸
		 */
		
		double[] d = new double[] {10.0, 12.5, 19.2};
		
		boolean[] b = {true, true, false};
	}
}
