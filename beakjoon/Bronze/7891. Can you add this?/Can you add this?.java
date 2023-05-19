import java.util.Scanner;
import java.math.BigInteger;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i=0; i<n; i++) 
		{
			BigInteger x = sc.nextBigInteger();
			BigInteger y = sc.nextBigInteger();
			System.out.println(x.add(y));
		}
	}
}
