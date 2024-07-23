package S21221_00;

public class StringConcat01 {

	public static void main(String[] args) {
		// 숫자 연산
		int value = 10 + 2 + 8;
		System.out.println("value : " + value);
		
		// 결합 연산
		String str1 = 10 + 2 + "8"; // -> 128
		System.out.println("str1 : " + str1 + ", type : " + str1.getClass().getName());
		
		String str2 = 10 + "2" + 8; // -> 1028
		System.out.println("str2 : " + str2 + ", type : " + str2.getClass().getName());
		
		String str3 = "10" + 2 + 8; // -> 1028
		System.out.println("str3 : " + str3 + ", type : " + str3.getClass().getName());
		
		String str4 = "10" + (2 + 8); // -> 1010
		System.out.println("str4 : " + str4 + ", type : " + str4.getClass().getName());
	}
}

/*
실행 결과
-------------------------------------
value : 20
str1 : 128, type : java.lang.String
str2 : 1028, type : java.lang.String
str3 : 1028, type : java.lang.String
str4 : 1010, type : java.lang.String
*/
