import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] nums = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }

        long[] t = new long[80001];
        long[] s = new long[80001];
        long temp = 0;
        for (int i = 0; i < 80001; i++) {
            if (i % 3 == 0) {
                temp += i;
            }

            t[i] = temp;
        }

        temp = 0;
        for (int i = 0; i < 80001; i++) {
            if (i % 7 == 0) {
                if (i % 3 != 0) {
                    temp += i;
                }
            }

            s[i] = temp;
        }

        for (int i = 0; i < n; i++) {
            System.out.println(s[nums[i]] + t[nums[i]]);
        }
    }
}
