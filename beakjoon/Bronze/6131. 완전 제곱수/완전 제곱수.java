import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int cnt = 0;
        int a, b;

        for(int i = 1; i < 501; i++) {
            b = i;
            a = (int) Math.sqrt((b * b) + n);

            if((a * a) - n == b * b) {
                cnt++;
            }
        }
        
        System.out.println(cnt);
    }
}
