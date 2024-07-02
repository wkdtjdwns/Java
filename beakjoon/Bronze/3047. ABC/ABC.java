import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] abc = new int[3];
        for (int i = 0; i < 3; i++) {
            abc[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(abc);
        String str = br.readLine();
        for (int i = 0; i < 3; i++) {
            if (str.charAt(i) == 'A') {
                System.out.print(abc[0] + " ");
            }

            else if (str.charAt(i) == 'B') {
                System.out.print(abc[1] + " ");
            }

            else {
                System.out.print(abc[2] + " ");
            }
        }
    }
}
