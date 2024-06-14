import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int M = 0;
        int O = 0;
        int B = 0;
        int I = 0;
        int S = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'M') {
                M = 1;
            }

            else if (str.charAt(i) == 'O') {
                O = 1;
            }

            else if (str.charAt(i) == 'B') {
                B = 1;
            }

            else if (str.charAt(i) == 'I') {
                I = 1;
            }

            else if (str.charAt(i) == 'S') {
                S = 1;
            }
        }

        if (M == 1 && O == 1 && B == 1 && I == 1 && S == 1) {
            System.out.println("YES");
        }

        else {
            System.out.println("NO");
        }
    }
}
