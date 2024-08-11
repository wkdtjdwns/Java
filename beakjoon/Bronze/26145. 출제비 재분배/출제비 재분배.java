import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuffer sb = new StringBuffer();
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] array = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            array[i] = Integer.parseInt(st.nextToken());
        }

        int[][] money = new int[n][n + m];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n + m; j++) {
                money[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int[] amount = new int[n + m];
        for (int i = 0; i < n; i++) {
            amount[i] = array[i];
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n + m; j++) {
                amount[j] += money[i][j];
                amount[i] -= money[i][j];
            }
        }

        for (int i = 0; i < n + m; i++) {
            sb.append(amount[i]).append(" ");
        }

        System.out.println(sb);
    }
}
