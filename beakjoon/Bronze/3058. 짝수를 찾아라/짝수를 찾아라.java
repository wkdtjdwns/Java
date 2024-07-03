import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int sum = 0;
            int min = 100;
            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < 7; j++) {
                int n = Integer.parseInt(st.nextToken());
                if (n % 2 == 0) {
                    sum += n;
                    if (min > n) { min = n; }
                }
            }

            System.out.println(sum + " " + min);
        }
    }
}
