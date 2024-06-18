import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());

            for (int j = 0; j < n / 5; j++) {
                System.out.print("++++ ");
            }

            for (int k = 0; k < n % 5; k++) {
                System.out.print("|");
            }

            System.out.println();
        }
    }
}
