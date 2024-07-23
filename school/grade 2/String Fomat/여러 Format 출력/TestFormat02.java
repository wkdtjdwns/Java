package S21221_00;

public class TestFormat02 {

	public static void main(String[] args) {
		int value = 123;
		System.out.printf("상품의 가격 : %d원\n", value);   // 상품의 가격 : 123원
		System.out.printf("상품의 가격 : %6d원\n", value);  // 상품의 가격 :    123원
		System.out.printf("상품의 가격 : %-6d원\n", value); // 상품의 가격 : 123   원
		System.out.printf("상품의 가격 : %06d원\n", value); // 상품의 가격 : 000123원
		
		double area = 3.141592 * 10 * 10;
		
		// 반지름이 10인 원의 넓이 :     314.16
		System.out.printf("반지름이 %d인 원의 넓이 : %10.2f\n", 10, area);
		
		String name = "우리들";
		String job = "소프트웨어개발과";
		
		//      1 | 우리들        |   소프트웨어개발과
		System.out.printf("%6d | %-10s | %10s\n", 1, name, job);
	}
}

/*
실행 결과
-------------------------------------------
상품의 가격 : 123원
상품의 가격 :    123원
상품의 가격 : 123   원
상품의 가격 : 000123원
반지름이 10인 원의 넓이 :     314.16
     1 | 우리들        |   소프트웨어개발과
*/
