package lang.string.Ex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex2 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] str1 = br.readLine().toCharArray();
        int[] alpha = new int[26];

        for (int i = 0; i < str1.length; i++) {
            alpha[str1[i] - 'a']++;
        }

        char[] str2 = br.readLine().toCharArray();
        for (int i = 0; i < str2.length; i++) {
            alpha[str2[i] - 'a']--;
        }

        int cnt = 0;
        for (int i = 0; i < alpha.length; i++) {
            if (alpha[i] != 0) {
                cnt += Math.abs(alpha[i]);
            }
        }

        System.out.println(cnt);
    }
}
