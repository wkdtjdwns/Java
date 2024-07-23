package S21221_00;

public class PrimitiveConversion01 {

	public static void main(String[] args) {
		// 자동 형변환 (암시적 형변환)
		int int_value = 10;
		byte byte_value = (byte)int_value; // 형변환 (int -> byte)
		System.out.println("byte_value : " + byte_value);
		
		int_value = 65;
		char char_value = (char)int_value; // 형번환 (int -> char)
		System.out.println("char_value : " + char_value); // A (char는 아스키코드로 저장하기 때문)
		
		// 수동 형변환 (명시적 형변환)
		double double_value = 3.14;
		int_value = (int)double_value; // 형변환 (double -> int)
		System.out.println("int_value : " + int_value); // 3
		
		int_value = 10;
		double_value = 5.7;
		int result = int_value + (int)double_value; // 형변환 (double -> int)
		System.out.println("result : " + result); // 10 + 5 = 15 (실수형을 정수형을 변환할 때는 소수점 이하를 "내림"하기 때문
	}
}

/*
실행 결과
---------------
byte_value : 10
char_value : A
int_value : 3
result : 15
*/
