import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            if (a + b == 0) { break; }

            int cnt = 0;
            int add = 0;
            while (a != 0 || b != 0) {
                int aM = a % 10;
                int bM = b % 10;

                a /= 10;
                b /= 10;

                if (aM + bM + add >= 10) {
                    cnt++;
                    add = 1;
                }

                else { add = 0; }
            }

            System.out.println(cnt);
        }
    }
}
