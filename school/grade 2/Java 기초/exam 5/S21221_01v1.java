package S21221_00;

public class S21221_01v1 {

	public static void main(String[] args) {
		int num1 = 0b1011; // 1011(2) : 1*2^0 + 1*2^1 + 0*2^2 + 1*2^3 -> 1 + 2 + 0 + 8 = 11  // 0b -> 자바의 2진수 표기법
		int num2 = 0206; // 206(8) : 6*8^0 + 0*8^1 + 2*8^2 -> 6 + 0 + 128 = 134 // 0 -> 자바의 8진수 표기법
		int num3 = 365; // 365(10) : 5*10^0 + 6*10^1 + 3*10^2 -> 5 + 60 + 300 = 365
		int num4 = 0xB3; // B3(16) : 3*16^0 + 11*16 -> 3 + 176 = 179 // B : 11 // 0x -> 자바의 16진수 표기법
		
		System.out.println("Num1 : " + num1);
		System.out.println("Num1 : " + num2);
		System.out.println("Num1 : " + num3);
		System.out.println("Num1 : " + num4);
	}
}
