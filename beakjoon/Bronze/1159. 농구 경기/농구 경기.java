import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] alphabet = new int[26];
        for (int i = 0; i < n; i++) {
            String name = br.readLine();
            alphabet[name.charAt(0) - 'a']++;
        }

        boolean check = true;
        for (int i = 0; i < 26; i++) {
            if (alphabet[i] >= 5) {
                System.out.print((char)('a' + i));
                check = false;
            }
        }

        if (check) {
            System.out.println("PREDAJA");
        }
    }
}
