package S21221_00;

public class S21221_01v8 {

	public static void main(String[] args) {
		
		int int_val1 = 100;
		int int_val2 = -100;
		
		double dou_val1 = 3.14;
		double dou_val2 = -3.14;
		
		int int_result1 = -int_val1;
		int int_result2 = -int_val2;
		
		double dou_result1 = -dou_val1;
		double dou_result2 = -dou_val2;
				
		System.out.printf("int1 : %d int2 : %d\n", int_result1, int_result2);
		System.out.printf("dou1 : %f dou2 : %f\n", dou_result1, dou_result2);
	}
}

/*
실행결과
--------------------------------
int1 : -100 int2 : 100
dou1 : -3.140000 dou2 : 3.140000
*/
