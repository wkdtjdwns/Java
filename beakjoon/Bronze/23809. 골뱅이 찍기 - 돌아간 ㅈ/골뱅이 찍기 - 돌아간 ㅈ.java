import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    System.out.print("@");
                }

                for (int k = 0; k < n * (3 - i); k++) {
                    System.out.print(" ");
                }

                for (int k = 0; k < n; k++) {
                    System.out.print("@");
                }

                System.out.println();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n * 3; j++) {
                System.out.print("@");
            }

            System.out.println();
        }

        for (int i = 1; i >= 0; i--) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    System.out.print("@");
                }

                for (int k = 0; k < n * (3 - i); k++) {
                    System.out.print(" ");
                }

                for (int k = 0; k < n; k++) {
                    System.out.print("@");
                }

                System.out.println();
            }
        }
    }
}
