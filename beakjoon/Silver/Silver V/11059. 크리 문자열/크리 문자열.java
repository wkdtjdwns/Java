import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int result = 0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 2; j <= str.length(); j += 2) {
                String sub = str.substring(i, j);
                int sf = 0;
                int ss = 0;

                for (int k = 0; k < sub.length() / 2; k++) {
                    sf += sub.charAt(k) - '0';
                    ss += sub.charAt(k + sub.length() / 2) - '0';
                }

                if (sf == ss && sub.length() > result) {
                    result = sub.length();
                }
            }
        }

        System.out.println(result);
    }
}
