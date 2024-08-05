import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int q = Integer.parseInt(st.nextToken());
        boolean[] slots = new boolean[n];

        for (int i = 0; i < q; i++) {
            st = new StringTokenizer(br.readLine());
            int l = Integer.parseInt(st.nextToken());
            int interval = Integer.parseInt(st.nextToken());

            for (int j = l - 1; j < n; j += interval) {
                if (!slots[j]) {
                    slots[j] = true;
                }
            }
        }

        int result = 0;
        for (int i = 0; i < n; i++) {
            if (!slots[i]) {
                result++;
            }
        }

        System.out.println(result);
    }
}
