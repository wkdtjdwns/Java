import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());
        int num = Integer.parseInt(br.readLine());

        if (n > 5) {
            System.out.println("Love is open door");
        }

        else {
            for (int i = 0; i < n - 1; i++) {
                if (num == 1) {
                    System.out.println(0);
                    num = 0;
                }

                else {
                    System.out.println(1);
                    num = 1;
                }
            }
        }
    }
}
