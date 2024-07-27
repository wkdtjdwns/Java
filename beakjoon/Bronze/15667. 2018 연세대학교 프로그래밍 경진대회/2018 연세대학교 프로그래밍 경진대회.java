import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(br.readLine());
        for (int i = 1; i <= k; i++) {
            if (1 + i + i * i == k) {
                System.out.println(i);
                break;
            }
        }
    }
}
