import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] d = new String[n];
        int[] c = new int[n];
        int index = 0;
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            d[i] = st.nextToken();
            c[i] = Integer.parseInt(st.nextToken());

            if (d[i].equals("jinju")) {
                index = i;
            }
        }

        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (c[i] > c[index]) {
                cnt++;
            }
        }

        System.out.println(c[index]);
        System.out.println(cnt);
    }
}
