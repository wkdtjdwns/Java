import java.util.Scanner;
import java.math.BigInteger;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigInteger a = sc.nextBigInteger();
		BigInteger b = sc.nextBigInteger();
		System.out.println(a.add(b)); // 더하기
		System.out.println(a.subtract(b)); // 빼기
		System.out.println(a.multiply(b)); // 곱하기
	}
}
