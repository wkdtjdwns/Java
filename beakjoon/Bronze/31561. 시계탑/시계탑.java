import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(br.readLine());
        double result = (m <= 30.0 ? m / 2.0 : m * 3.0 / 2.0 - 30.0);
        System.out.printf("%.1f", result);
    }
}
