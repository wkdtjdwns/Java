import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int cnt = 0;
        for (int i = 1; i <= n; i++) {
            String[] str = Integer.toString(i).split("");
            int sum = 0;
            for (int j = 0; j < str.length; j++) {
                sum += Integer.parseInt(str[j]);
            }

            if (i % sum == 0) {
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}
