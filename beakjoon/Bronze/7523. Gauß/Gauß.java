import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 1; i <= t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            BigInteger n = new BigInteger(st.nextToken());
            BigInteger m = new BigInteger(st.nextToken());
            BigInteger sum = (m.subtract(n).add(BigInteger.ONE)).multiply((n.add(m))).divide(BigInteger.TWO);

            System.out.println("Scenario #" + i + ":");
            System.out.println(sum);
            System.out.println();
        }
    }
}
