import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String str = br.readLine();
            if (str.equals("0")) {
                break;
            }

            int result = 0;
            int index = str.length();
            for (char c : str.toCharArray()) {
                result += (c - '0') * factorial(index--);
            }

            System.out.println(result);
        }
    }

    public static int factorial(int n) {
        if (n < 2) {
            return 1;
        }

        return n * factorial(n - 1);
    }
}
