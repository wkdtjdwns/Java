import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();
        int[] uospc = new int[5];
        for (char c : str.toCharArray()) {
            if (c == 'u') {
                uospc[0]++;
            }

            else if (c == 'o') {
                uospc[1]++;
            }

            else if (c == 's') {
                uospc[2]++;
            }

            else if (c == 'p') {
                uospc[3]++;
            }

            else if (c == 'c') {
                uospc[4]++;
            }
        }

        int result = Math.min( Math.min( Math.min( Math.min(uospc[0], uospc[1]), uospc[2] ), uospc[3] ), uospc[4] );
        System.out.println(result);
    }
}
