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
        int total = 0;
        int cnt = 0;

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            total += Integer.parseInt(st.nextToken());
            if (total < 0) {
                total = 0;
            }
            
            if (total >= m) {
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}
