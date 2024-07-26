import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int a = Integer.parseInt(st.nextToken()) - 1;
        int b = Integer.parseInt(st.nextToken()) - 1;

        int[][] seats = new int[n][n];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                seats[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int target = seats[a][b];
        for (int i = 0; i < n; i++) {
            if (target < seats[a][i] || target < seats[i][b]) {
                System.out.println("ANGRY");
                return;
            }
        }

        System.out.println("HAPPY");
    }
}
