import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int[] array = new int[n];
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            array[i] = Integer.parseInt(br.readLine());
        }

        for (int i = 1; i <= c; i++) {
            for (int j = 0; j < n; j++) {
                int x = i % array[j];
                if (x == 0) {
                    cnt += 1;
                    break;
                }
            }
        }

        System.out.println(cnt);
    }
}
