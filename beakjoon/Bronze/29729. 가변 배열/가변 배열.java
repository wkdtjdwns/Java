import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int s = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int cnt = 0;
        for (int i = 0; i < n + m; i++) {
            int o = Integer.parseInt(br.readLine());
            if (o == 1) {
                if (s == cnt) {
                    s += s;
                }
                
                cnt++;
            }
            
            else {
                cnt--;
            }
        }

        System.out.println(s);
    }
}
