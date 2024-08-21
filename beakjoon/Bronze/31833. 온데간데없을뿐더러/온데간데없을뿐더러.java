import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String resultA = "";
        String resultB = "";

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            long num = Integer.parseInt(st.nextToken());
            resultA += num;
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            long num = Integer.parseInt(st.nextToken());
            resultB += num;
        }

        long a = Long.parseLong(resultA);
        long b = Long.parseLong(resultB);

        if (a > b) {
            System.out.println(b);
        }

        else {
            System.out.println(a);
        }
    }
}
