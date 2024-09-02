import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String n = br.readLine();
        String[] b = { "000", "001", "010", "011", "100", "101", "110", "111" };
        for (int i = 0; i < n.length(); i++) {
            int a = n.charAt(i) - '0';
            sb.append(b[a]);
        }

        if (n.equals("0")) {
            System.out.println(n);
        }

        else {
            while (sb.charAt(0) == '0') {
                sb = new StringBuilder(sb.substring(1));
            }

            System.out.println(sb);
        }
    }
}
