import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            long a = Long.parseLong(st.nextToken());
            int n = Integer.parseInt(st.nextToken());

            String result = convertToBase(a, n);
            System.out.println(isPalindrome(result) ? 1 : 0);
        }
    }

    static String convertToBase(long number, int base) {
        StringBuilder result = new StringBuilder();
        while (number > 0) {
            long remainder = number % base;
            result.append((char) (remainder < 10 ? '0' + remainder : 'A' + (remainder - 10)));
            number /= base;
        }

        return result.reverse().toString();
    }

    static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left++) != str.charAt(right--)) {
                return false;
            }
        }

        return true;
    }
}
