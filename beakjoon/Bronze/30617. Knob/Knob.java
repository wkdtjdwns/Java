import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int a = 0;
        int b = 0;
        int result = 0;
        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int c = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());
            if (i > 0) {
                if (a == c && a != 0) {
                    result++;
                }

                if (b == d && b != 0) {
                    result++;
                }
            }

            if (c == d && c != 0) {
                result++;
            }

            a = c;
            b = d;
        }

        System.out.println(result);
    }
}
