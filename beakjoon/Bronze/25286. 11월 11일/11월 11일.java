import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] temp = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int y = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            if (m == 1) {
                System.out.println(y - 1 + " " + 12 + " " + 31);
            }

            else {
                System.out.print(y + " " + (m - 1) + " ");
                if (m == 3 && ((y % 100 != 0 && y % 4 == 0) || y % 400 == 0)) {
                    System.out.println(29);
                }

                else {
                    System.out.println(temp[m - 1]);
                }
            }
        }
    }
}
