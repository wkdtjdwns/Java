import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int cnt = 0;
        while (cnt < Integer.MAX_VALUE) {
            cnt++;
            
            if (n == 1) { break; }
            if (n % 2 == 1) {
                n = n * 3 + 1;
            }
            
            else {
                n /= 2;
            }
        }

        System.out.print(cnt);
    }
}
