import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            BigInteger k = new BigInteger(br.readLine());
            if (k.mod(BigInteger.TWO).compareTo(BigInteger.ZERO) == 0) {
                System.out.println("even");
            }

            else {
                System.out.println("odd");
            }
        }
    }
}
