import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static int n;
    static int[] d;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 1; i <= t; i++) {
            n = Integer.parseInt(br.readLine());
            d = new int[n + 1];
            for (int j = 1; j <= n; j++) {
                for (int k = 1; j * k <= n; k++) {
                    if (d[j * k] != 0) {
                        d[j * k] = 0;
                    }

                    else {
                        d[j * k] = 1;
                    }
                }
            }

            int result = 0;
            for(int j = 1; j <= n; j++) {
                result += d[j];
            }
            
            System.out.println(result);
        }
    }
}
