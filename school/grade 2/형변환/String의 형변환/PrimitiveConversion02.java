package S21221_00;

public class PrimitiveConversion02 {

	public static void main(String[] args) {

		int value1     = Integer.parseInt("10");
		double value2  = Double.parseDouble("3.14");
		boolean value3 = Boolean.parseBoolean("true");
		
		System.out.println("value1 : " + value1);
		System.out.println("value2 : " + value2);
		System.out.println("value3 : " + value3);
		
		String str1 = String.valueOf(10);
		String str2 = String.valueOf(3.14);
		String str3 = String.valueOf(true);
		
		System.out.println("str1 : " + str1 + ", type : " + str1.getClass().getName());
		System.out.println("str2 : " + str2 + ", type : " + str2.getClass().getName());
		System.out.println("str3 : " + str3 + ", type : " + str3.getClass().getName());
	}
}

/*
실행 결과
--------------------------------------
value1 : 10
value2 : 3.14
value3 : true
str1 : 10, type : java.lang.String
str2 : 3.14, type : java.lang.String
str3 : true, type : java.lang.String
*/
