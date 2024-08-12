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
            int m = Integer.parseInt(st.nextToken());
            String type = st.nextToken();

            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                if (type.equals("C")) {
                    char c = st.nextToken().charAt(0);
                    System.out.print(c- '@' + " ");
                }

                else {
                    int n = Integer.parseInt(st.nextToken());
                    System.out.print((char)(n + 64) + " ");
                }
            }

            System.out.println();
        }
    }
}
