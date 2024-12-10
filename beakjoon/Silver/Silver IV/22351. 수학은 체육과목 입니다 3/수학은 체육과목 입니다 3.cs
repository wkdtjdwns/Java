import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] a) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int n = 1;
        if (str.length() < 4) {
            char c = str.charAt(0);
            for (; n < str.length(); n++) {
                if (str.charAt(n) != c) {
                    break;
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        if (n == str.length()) {
            sb.append(str).append(" ").append(str);
        }

        else {
            for (int i = 1; i <= 999; i++) {
                if (str.startsWith(Integer.toString(i))) {
                    String s = str;
                    for (int j = i; j <= 999; j++) {
                        if (s.startsWith(Integer.toString(j))) {
                            s = s.substring(Integer.toString(j).length());
                        }

                        else {
                            break;
                        }

                        if (s.length() == 0) {
                            sb.append(i).append(" ").append(j);
                            break;
                        }
                    }

                    if (sb.length() > 0) {
                        break;
                    }
                }
            }
        }

        System.out.println(sb);
    }
}
