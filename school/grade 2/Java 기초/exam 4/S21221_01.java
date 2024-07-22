package S21221_00;

public class S21221_01 {
	
	public static void main(String[] args) {
		
		int int_num1 = 0;
		if (int_num1 == 0)
		{
			int int_num2 = 10;
			System.out.println("int_num1 : " + int_num1 + " if int_num2 : " + int_num2);
		}
		
		// 지역변수를 밖에서 사용해서 오류가 뜸
		// System.out.println("int_num1 : " + int_num1 + " if int_num2 : " + int_num2);
	}
}
