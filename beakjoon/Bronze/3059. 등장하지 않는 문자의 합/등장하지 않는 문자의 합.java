import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            String s = br.readLine();
            boolean[] alpha = new boolean[26];
            for (int j = 0; j < s.length(); j++) {
                if (!alpha[s.charAt(j) - 'A']) { alpha[s.charAt(j) - 'A'] = true; }
            }

            int sum = 0;
            int cnt = 0;
            for (int k = 0; k < alpha.length; k++) {
                if (!alpha[k]) {
                    sum += k;
                    cnt++;
                }
            }

            sum += cnt * 65;

            System.out.println(sum);
        }
    }
}
