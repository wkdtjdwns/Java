import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            int total = 0;
            for (int j = 1; j <= n; j++) {
                total += j * (j + 1) * (j + 2) / 2;
            }
            
            System.out.println(total);
        }
    }
}
