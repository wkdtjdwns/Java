import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());
        int[] bread = new int[n * k];
        int result = n;
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n * k; i++) {
            bread[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < n; i++) {
            int cnt = 0;

            for (int j = 0; j < k; j++) {
                if (bread[i * k + j] == 0){
                    cnt++;
                }
            }

            if (cnt >= p){
                result--;
            }
        }

        System.out.println(result);
    }
}
