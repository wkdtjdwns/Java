import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] points = new int[n][2];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            points[i][0] = Integer.parseInt(st.nextToken());
            points[i][1] = Integer.parseInt(st.nextToken());
        }

        int result = 0;
        for (int i = 0; i < n; i++) {
            int x1 = points[i][0]; int x2 = points[(i + 1) % n][0];
            int y1 = points[i][1]; int y2 = points[(i + 1) % n][1];

            result += Math.abs(x2 - x1) + Math.abs(y2 - y1);
        }

        System.out.println(result);
    }
}
