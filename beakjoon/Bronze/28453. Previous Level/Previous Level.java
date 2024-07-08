import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int m = Integer.parseInt(st.nextToken());
            if (m >= 300) {
                System.out.print("1 ");
            }

            else if (m >= 275) {
                System.out.print("2 ");
            }

            else if (m >= 250) {
                System.out.print("3 ");
            }

            else {
                System.out.print("4 ");
            }
        }
    }
}
