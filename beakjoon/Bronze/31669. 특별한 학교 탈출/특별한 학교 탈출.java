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
        String[] a = new String[n];

        for (int i = 0; i < n; i++) {
            a[i] = br.readLine();
        }

        int i;
        for (i = 0; i < m; i++) {
            int cnt = 0;
            for (int j = 0; j < n; j++) {
                if (a[j].charAt(i) == 'X') {
                    cnt++;
                }
            }

            if (cnt == n) {
                System.out.println(i + 1);
                break;
            }
        }

        if (i == m) {
            System.out.println("ESCAPE FAILED");
        }
    }
}
