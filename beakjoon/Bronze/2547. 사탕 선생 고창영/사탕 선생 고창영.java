import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            String q = br.readLine();

            int n = Integer.parseInt(br.readLine());
            BigInteger sum = new BigInteger("0");

            for (int j = 0; j < n; j++) {
                sum = sum.add(BigInteger.valueOf(Long.parseLong(br.readLine())));
            }

            System.out.println((String.valueOf(sum.remainder(BigInteger.valueOf(n))).equals("0")) ? "YES" : "NO");
        }
    }
}
