import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        StringBuilder sb = new StringBuilder(str);
        for (int i = 0; i < str.length(); i++) {
            char c = (char)(str.charAt(i) - 3);
            if (c < 65) c += 26;

            sb.setCharAt(i, c);
        }

        System.out.println(sb);
    }
}
