import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] a = new int[k];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < k; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }

        int multiTab = 0;
        for (int i : a) {
            multiTab += i / 2;
            if (i % 2 == 1) {
                multiTab += 1;
            }
        }

        System.out.println(multiTab >= n ? "YES" : "NO");
    }
}
