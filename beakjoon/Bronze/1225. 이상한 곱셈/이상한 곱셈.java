import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String a = st.nextToken();
        String b = st.nextToken();
        long result = 0;
        for (char c1 : a.toCharArray()) {
            for (char c2 : b.toCharArray()) {
                result += (c1 - '0') * (c2 - '0');
            }
        }

        System.out.println(result);
    }
}
