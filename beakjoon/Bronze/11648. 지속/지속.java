import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int cnt = 0;
        while (str.length() > 1) {
            int n = 1;
            for (int i = 0; i < str.length(); i++) {
                n *= (str.charAt(i) - '0');
            }

            str = String.valueOf(n);
            cnt++;
        }

        System.out.println(cnt);
    }
}
