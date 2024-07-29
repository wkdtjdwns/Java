import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int result = 0;
        for (int i = 0; i < n; i++) {
            result++;
            if (Integer.toString(i).contains("50")) {
                result++;
            }
        }

        System.out.println(result);
    }
}
