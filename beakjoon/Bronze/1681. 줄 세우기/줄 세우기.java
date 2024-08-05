import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        String l = st.nextToken();
        int cnt = 0;
        while (n > 0) {
            cnt++;
            if (!String.valueOf(cnt).contains(l)) {
                n--;
            }
        }

        System.out.println(cnt);
    }
}
