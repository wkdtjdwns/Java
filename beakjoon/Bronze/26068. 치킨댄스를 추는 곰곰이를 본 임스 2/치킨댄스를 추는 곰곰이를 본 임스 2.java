import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), "-");
            String d = st.nextToken();
            int x = Integer.parseInt(st.nextToken());

            if (x <= 90) {
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}
