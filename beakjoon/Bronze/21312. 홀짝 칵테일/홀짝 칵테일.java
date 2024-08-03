import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] abc = new int[3];
        boolean isOdd = false;
        int result1 = 1; int result2 = 1;

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 3; i++) {
            abc[i] = Integer.parseInt(st.nextToken());
            if (abc[i] % 2 == 1) {
                result1 *= abc[i];
                isOdd = true;
            }

            else {
                result2 *= abc[i];
            }
        }

        if (isOdd) {
            System.out.println(result1);
        }

        else {
            System.out.println(result2);
        }
    }
}
