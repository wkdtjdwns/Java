import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		// 연산자 사용
		int A = in.nextInt();
		int B = in.nextInt();
		
		System.out.println(A * (B % 10)); // A * (B를 10으로 나눈 나머지 => B의 1의 자리)
		System.out.println(A * (B % 100 / 10)); // A * (B를 100으로 나눈 나머지(100의 자리) 나누기 10 => B의 10의 자리)
		System.out.println(A * (B / 100)); // A * (B를 100으로 나눈 값 => B의 100의 자리)
		System.out.println(A * B);
		
		in.close();
	}
}
