package S21221_00;

public class PrintfSungjuk {

	public static void main(String[] args) {
		String name = "홍길동";
		String id = "21200";
		
		int kor = 98;
		int eng = 91;
		int mat = 100;

		System.out.println("성명   학번    국어   영어  수학  총점  평균");
		System.out.println("---------------------------------------");
//		System.out.printf("%s %-6s %4d %4d %4d %4d %5.1f\n", 
//				name, id, kor, eng, mat, (kor + eng + mat), ((double)(kor + eng + mat) / 3));
		
		int sum = kor + eng + mat;
		double avg = sum / 3.;
		
		System.out.printf("%s %-6s %4d %4d %4d %4d %5.1f\n",
				name, id, kor, eng, mat, sum, avg);
		
		String name2 = "차이점";
		String id2 = "21299";
		
		int kor2 = 100;
		int eng2 = 99;
		int mat2 = 96;
		
		int sum2 = kor2 + eng2 + mat2;
		double avg2 = sum2 / 3.;
		
		System.out.printf("%s %6s %-4d %4d %-4d %-4d %-5.1f\n",
				name2, id2, kor2, eng2, mat2, sum2, avg2);
	}
}

/*
실행 결과
------------------------------------------
성명   학번    국어   영어  수학  총점  평균
---------------------------------------
홍길동 21200    98   91  100  289  96.3
차이점  21299 100    99 96   295  98.3 
*/
