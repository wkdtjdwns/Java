import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        long m = Long.parseLong(st.nextToken());

        long result = 1;
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            result = (result * (Long.parseLong(st.nextToken()) % m)) % m;
        }

        System.out.println(result);
    }
}
