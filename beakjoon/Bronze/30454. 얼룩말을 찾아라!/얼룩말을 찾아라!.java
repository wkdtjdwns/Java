import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());
        int[] cnt = new int[n];
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            int c = 0;
            for (int j = 0; j < l - 1; j++) {
                if (str.charAt(j) == '1' && str.charAt(j + 1) == '0') {
                    c++;
                }
            }

            if (str.charAt(l - 1) == '1') {
                c++;
            }

            cnt[i] = c;
            max = Math.max(max, cnt[i]);
        }

        int zebra = 0;
        for (int i = 0; i < n; i++) {
            if (cnt[i] == max) {
                zebra++;
            }
        }

        System.out.println(max + " " + zebra);
    }
}
