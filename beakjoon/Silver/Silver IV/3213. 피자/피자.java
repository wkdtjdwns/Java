import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int p1 = 0;
        int p2 = 0;
        int p3 = 0;

        int result = 0;
        int rest = 0;
        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            if (str.equals("1/2")) {
                p1++;
            }

            else if (str.equals("3/4")) {
                p2++;
            }

            else {
                p3++;
            }
        }

        if (p1 % 2 == 0) {
            result += p1 / 2;
        }

        else {
            result += p1 / 2;
            rest += 2;
        }

        if (p2 > p3) {
            result += p3 + (p2 - p3);
        }

        else if (p2 < p3) {
            result += p2;
            rest += p3 - p2;
        }

        else {
            result += p3;
        }

        if (result % 4 == 0) {
            result += rest / 4;
        }

        else {
            result += rest / 4 + 1;
        }

        System.out.println(result);
    }
}
