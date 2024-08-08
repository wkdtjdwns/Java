package test0000;

public class Random {

	public static void main(String[] args) {
	
		// 0.0 ~ 1.0 사이의 실수 난수 구하기
		for (int i = 1; i <= 5; i++) {
			System.out.println(Math.random());
		}
		
		// 1 ~ 10까지의 정수 난수 구하기
		for (int i = 1; i <= 5; i++) {
			// System.out.println((int)(Math.random() * 10) + 1);
			System.out.println(Math.round(Math.random() * 9 + 1));
		}		
	}
}
/*
실행 결과
--------------------
0.5809988059376986
0.6630919940519748
0.032322363698131795
0.38785658065644757
0.1058341005764647
2
4
2
2
10
*/
