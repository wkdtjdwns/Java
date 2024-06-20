import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] prices = new int[n];
        for (int i = 0; i < n; i++) {
            prices[i] = Integer.parseInt(br.readLine());
        }

        int m = Integer.parseInt(br.readLine());
        int total = 0;
        for (int j = 0; j < m; j++) {
            total += prices[Integer.parseInt(br.readLine()) - 1];
        }

        System.out.println(total);
    }
}
