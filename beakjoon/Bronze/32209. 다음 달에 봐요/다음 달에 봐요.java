import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int q = Integer.parseInt(br.readLine());
        int problems = 0;
        boolean check = false;
        for (int i = 0; i < q; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int event = Integer.parseInt(st.nextToken());
            int cnt = Integer.parseInt(st.nextToken());
            if (event == 1) {
                problems += cnt;
            }

            else if (event == 2) {
                if (problems >= cnt) {
                    problems -= cnt;
                }

                else {
                    check = true;
                    break;
                }
            }
        }

        if (check) {
            System.out.println("Adios");
        }

        else {
            System.out.println("See you next month");
        }
    }
}
