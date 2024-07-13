import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            int cnt = 0;

            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                int candy = Integer.parseInt(st.nextToken());
                cnt += candy / k;
            }
            
            System.out.println(cnt);
        }
    }
}
