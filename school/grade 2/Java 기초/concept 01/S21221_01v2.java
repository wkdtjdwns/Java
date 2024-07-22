package S21221_00;

public class S21221_01v2 {

	public static void main(String[] args) {
		float var1 = 3.14f; // float은 변수의 값이 float이라는 것을 알려주기 위해 값의 뒤에 "f"를 붙임 (표현 byte의 차이 때문)
		double var2 = 3.14; // double은 뒤에 "d"를 써도 괜찮지만 굳이 쓰진 않음
		
		// 실수형 정밀도 범위
		// float : 7자리
		// double : 15자리
		
		// 표현 byte의 차이 때문에 표현하는 자릿수가 다름
		float var3 = 0.1234567890123456789f; // 0.12345679
		double var4 = 0.1234567890123456789; // 0.12345678901234568
		
		// 앞에 있는 1도 자릿수로 인정함
		// 소수점 (.)과 1의 자리수의 0은 자릿수 인정하지 않음
		float var5 = 1.234567890123456789f; // 1.2345679
		double var6 = 1.234567890123456789; // 1.2345678901234567
		
		double var7 = 3e6; // 3.0 * 10^6 = 3000000.0
		float var8 = 3e6f; // 3.0 * 10^6 = 3000000.0
		double var9 = 2e-3; // 2.0 * 10^-3 = 0.002
		
		System.out.println("var1 : " + var1);
		System.out.println("var2 : " + var2);
		System.out.println("var3 : " + var3);
		System.out.println("var4 : " + var4);
		System.out.println("var5 : " + var5);
		System.out.println("var6 : " + var6);
		System.out.println("var7 : " + var7);
		System.out.println("var8 : " + var8);
		System.out.println("var9 : " + var9);
	}
}

/*
실행 결과
---------------------------
var1 : 3.14
var2 : 3.14
var3 : 0.12345679
var4 : 0.12345678901234568
var5 : 1.2345679
var6 : 1.2345678901234567
var7 : 3000000.0
var8 : 3000000.0
var9 : 0.002
*/
