import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        String temp = st.nextToken();
        char start = temp.charAt(0);

        boolean check = true;
        for (int i = 1; i < n; i++) {
            String tmp = st.nextToken();
            if (start != tmp.charAt(0)) {
                check = false;
                break;
            }
        }

        System.out.println(check ? 1 : 0);
    }
}
