import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            int m = Integer.parseInt(br.readLine());
            long result = 0;
            long[] kArray = new long[m];
            long[] dArray = new long[m];
            long[] aArray = new long[m];

            for (int j = 0; j < m; j++) {
                st = new StringTokenizer(br.readLine());
                kArray[j] = Long.parseLong(st.nextToken());
                dArray[j] = Long.parseLong(st.nextToken());
                aArray[j] = Long.parseLong(st.nextToken());
            }

            st = new StringTokenizer(br.readLine());

            long k = Long.parseLong(st.nextToken());
            long d = Long.parseLong(st.nextToken());
            long a = Long.parseLong(st.nextToken());

            for (int j = 0; j < m; j++) {
                long total = (kArray[j] * k) - (dArray[j] * d) + (aArray[j] * a);

                if (total > 0) {
                    result += total;
                }
            }

            System.out.println(result);
        }
    }
}
