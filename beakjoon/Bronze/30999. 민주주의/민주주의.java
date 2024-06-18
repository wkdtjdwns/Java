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

        int cnt = 0;
        for (int i = 0; i < n; i++) {
            String str = br.readLine();

            int o = 0;
            int x = 0;
            for (int j = 0; j < m; j++) {
                if (str.charAt(j) == 'O') {
                    o++;
                }

                else {
                    x++;
                }
            }

            if (o > x) {
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}
