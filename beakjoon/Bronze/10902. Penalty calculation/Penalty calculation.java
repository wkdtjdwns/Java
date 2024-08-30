import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] t = new int[n];
        int[] s = new int[n];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            t[i] = Integer.parseInt(st.nextToken());
            s[i] = Integer.parseInt(st.nextToken());
        }

        int max = Integer.MIN_VALUE;
        int f = -1;
        for (int i = 0; i < n; i++) {
            if (s[i] > max) {
                max = s[i];
                f = i;
            }
        }

        int result = 0;
        if (max == 1 || max == 4) {
            result = t[f] + f * 20;
        }

        System.out.println(result);
    }
}
