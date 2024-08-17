import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.math.BigInteger;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int k = 5;
        System.out.println(getResult(n, k));
    }

    static BigInteger factorial(int n) {
        if (n < 1) {
            return BigInteger.ONE;
        }

        return factorial(n - 1).multiply(BigInteger.valueOf(n));
    }

    static BigInteger getResult(int n, int k) {
        if (k < 0 || k > n) {
            return BigInteger.ZERO;
        }

        return factorial(n).divide((factorial(k).multiply(factorial(n - k))));
    }
}
