import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int odd = 0;
        int even = 0;
        for (int i = 0; i < n; i++) {
            if ((Integer.parseInt(st.nextToken()) % 2) == 0) {
                even++;
            }

            else {
                odd++;
            }
        }

        if (odd == even || (odd - even) == 1) {
            System.out.println(1);
        }
        
        else {
            System.out.println(0);
        }
    }
}
