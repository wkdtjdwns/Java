import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int group = Integer.parseInt(br.readLine());
        int max = 0;
        for (int i = 0; i < group; i++) {

            int score = 0;
            for (int j = 0; j < 3; j++) {
                st = new StringTokenizer(br.readLine());
                score += a * Integer.parseInt(st.nextToken());
                score += b * Integer.parseInt(st.nextToken());
                score += c * Integer.parseInt(st.nextToken());
            }

            max = Math.max(max, score);
        }

        System.out.print(max);
    }
}
