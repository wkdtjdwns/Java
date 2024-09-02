import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int t = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        int mix = m;
        int cnt = 0;

        if ((M - m) < t) {
            System.out.println(-1);
        }

        else {
            while (true) {
                if ((m + t) <= M) {
                    m += t;
                    n--;
                }

                else {
                    m -= r;
                }

                if (m < mix) {
                    m = mix;
                }

                cnt++;
                if (n == 0) {
                    break;
                }
            }

            System.out.println(cnt);
        }
    }
}
