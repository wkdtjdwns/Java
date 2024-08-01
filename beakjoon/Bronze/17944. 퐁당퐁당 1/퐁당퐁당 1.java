import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int t = Integer.parseInt(st.nextToken());
        int cnt = 0;
        int x = 1;

        for (int i = 0; i < t; i++) {
            cnt += x;
            if (cnt == 2 * n) {
                x = -1;
            }
            
            if (cnt == 1) {
                x = 1;
            }
        }

        System.out.println(cnt);
    }
}
