import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n + 2; i++) {
            System.out.print("@");
        }

        System.out.println();

        for (int i = 0; i < n; i++) {
            System.out.print("@");
            for (int j = 0; j < n; j++) {
                System.out.print(" ");
            }

            System.out.println("@");
        }

        for (int i = 0; i < n + 2; i++) {
            System.out.print("@");
        }
    }
}
