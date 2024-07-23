import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());
        int cur = h * 3600 + m * 60 + s;
        
        int q = Integer.parseInt(br.readLine());
        for (int i = 0; i < q; i++) {
            st = new StringTokenizer(br.readLine());
            int t = Integer.parseInt(st.nextToken());

            if (t == 3) {
                System.out.println((cur / 3600) + " " + ((cur / 60) % 60) + " " + cur % 60);
            }

            else if (t == 1) {
                int x = Integer.parseInt(st.nextToken());
                cur = (cur + x) % 86400;
            }

            else {
                int x = Integer.parseInt(st.nextToken());
                cur = (cur - x) % 86400;

                while (cur < 0) {
                    cur += 86400;
                }
            }
        }
    }
}
