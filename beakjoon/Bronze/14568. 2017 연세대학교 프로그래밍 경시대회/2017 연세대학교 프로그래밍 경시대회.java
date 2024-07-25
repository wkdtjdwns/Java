import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int result = 0;
        for (int i = 2; i < n - 1; i += 2) {
            result += (n - i - 2) / 2;
        }

        System.out.println(result);
    }
}
