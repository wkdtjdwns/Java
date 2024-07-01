import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        if (n % 2 == 0) {
            System.out.println((n / 2 + 1) * (n / 2 + 1));
        }

        else {
            System.out.println((n / 2 + 1) * (n / 2 + 2));
        }
    }
}
