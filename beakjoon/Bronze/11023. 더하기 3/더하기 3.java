import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int total = 0;
        for (int i = 0; i < 100; i++) {
            if (!st.hasMoreElements()) {
                break;
            }

            total += Integer.parseInt(st.nextToken());
        }

        System.out.println(total);
    }
}
