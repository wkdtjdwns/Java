import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int sum = 0;
        int temp = 0;
        int cnt = 1;
        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(st.nextToken());
            if (a != temp) {
                cnt = 1;
                temp = a;
            }

            cnt *= 2;
            sum += cnt;
            if (sum >= 100) {
                sum = 0;
                cnt = 1;
            }
        }

        System.out.println(sum);
    }
}
