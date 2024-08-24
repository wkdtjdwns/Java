import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            long a = Long.parseLong(st.nextToken());
            long b = Long.parseLong(st.nextToken());

            int cnt = -1;
            long n2 = 1;
            if (a % 2 == 1) {
                System.out.println(n);
            }

            else {
                for (int j = 0; j < n; j++) {
                    n2 *= 2;
                }

                while (a != 0) {
                    if (a >= n2) {
                        a -= n2;
                    }

                    n2 /= 2;
                    cnt++;
                }

                System.out.println(cnt);
            }
        }
    }
}
