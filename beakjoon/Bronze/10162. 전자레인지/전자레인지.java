import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String result = "";

        int[] seconds = {300, 60, 10};
        int t = Integer.parseInt(br.readLine());

        if (t % 10 != 0) {
            System.out.println("-1");
        }

        else {
            for (int i = 0; i < seconds.length; i++) {
                result += (t / seconds[i] + " ");
                t %= seconds[i];
            }

            System.out.println(result);
        }
    }
}
