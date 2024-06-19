package lang.string.Ex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex3 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] alpha = new char[26];
        char curChar = 'A';
        for (int i = 0; i < 26; i++) {
            alpha[i] = curChar;
            curChar++;
        }

        char[] str = br.readLine().toUpperCase().toCharArray();

        int[] result = new int[26];
        for (int i = 0; i < str.length; i++) {
            result[str[i] - 'A']++;
        }

        int max = -1;
        int maxIndex = 0;
        for (int i = 0; i < 26; i++) {
            if (result[i] > max) {
                max = result[i];
                maxIndex = i;
            }
        }

        boolean check = false;
        for (int i = 0; i < 26; i++) {
            if (i == maxIndex) {
                continue;
            }

            if (result[i] == max) {
                check = true;
            }
        }

        if (check) {
            System.out.println("?");
        }

        else {
            System.out.println(alpha[maxIndex]);
        }
    }
}
