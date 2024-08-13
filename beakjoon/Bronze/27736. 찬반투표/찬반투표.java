import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int ok = 0;
        int no = 0;
        int hmm = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(st.nextToken());
            
            if (a == 1) {
                ok++;
            }

            else if (a == -1) {
                no++;
            }

            else {
                hmm++;
            }
        }

        int m = n % 2 == 0 ? n / 2 : n / 2 + 1;
        if (hmm >= m) {
            System.out.println("INVALID");
            return;
        }

        if (ok > no) {
            System.out.println("APPROVED");
        }

        else {
            System.out.println("REJECTED");
        }
    }
}
