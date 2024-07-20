import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] mirror = new String[n];
        for (int i = 0; i < n; i++) {
            mirror[i] = br.readLine();
        }

        int k = Integer.parseInt(br.readLine());
        if (k == 1) {
            for (int i = 0; i < n; i++) {
                System.out.println(mirror[i]);
            }
        }

        else if (k == 2) {
            for (int i = 0; i < n; i++) {
                for (int j = n - 1; j >= 0; j--) {
                    System.out.print(mirror[i].charAt(j));
                }

                System.out.println();
            }
        }

        else {
            for (int i = n - 1; i >= 0; i--) {
                System.out.println(mirror[i]);
            }
        }
    }
}
