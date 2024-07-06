import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            String s = "Pairs for " + n + ": ";

            for (int j = 1; j <= n / 2; j++) {
                if (j != (n - j)) {
                    if (j > 1) {
                        s += ", ";
                    }

                    s += j + " " + (n - j);
                }
            }
            
            System.out.println(s);
        }
    }
}
