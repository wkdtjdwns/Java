import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int t1 = Integer.parseInt(st.nextToken());
            int t2 = Integer.parseInt(st.nextToken());
            int t3 = Integer.parseInt(st.nextToken());

            if (t1 != -1) {
                if (t2 == -1 && t3 == -1) {
                    cnt++;
                }

                else if (t2 != -1) {
                    if ((t1 <= t2) && (t3 == -1 || t2 <= t3)) {
                        cnt++;
                    }
                }
            }
        }

        System.out.println(cnt);
    }
}
