import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i = 1; i <= n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }

            if (i == n) {
                for (int j = 0; j < 2 * i - 1; j++) {
                    System.out.print("*");
                }
            }

            else {
                for (int j = 0; j < 2 * i - 1; j++) {
                    if (j == 0 || j == 2 * i - 1 - 1) {
                        System.out.print("*");
                    }

                    else {
                        System.out.print(" ");
                    }
                }
            }

            System.out.println();
        }
    }
}
