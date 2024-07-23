package S21221_00;

public class StringConcat02 {

	public static void main(String[] args) {
		int value = 3 + 7; // -> int value 10
		System.out.println("value : " + value);
		
		String str1 = "3" + 7; // -> String "3" + "7" -> "37"
		System.out.println("str : " + str1 + ", type : " + str1.getClass().getName());
		

		String str2 = "3" + "7"; // -> String "37"
		System.out.println("str : " + str2 + ", type : " + str2.getClass().getName());
	}
}

/*
실행 결과
----------------------------------
value : 10
str : 37, type : java.lang.String
str : 37, type : java.lang.String
*/
