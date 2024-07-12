import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int t = Integer.parseInt(br.readLine());
        int[] abc = new int[3];
        for (int i = 1; i <= t; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < abc.length; j++) {
                abc[j] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(abc);

            System.out.printf("Case #%d: ", i);
            if (abc[0] + abc[1] <= abc[2]) {
                System.out.println("invalid!");
            }

            else if (abc[0] == abc[1] && abc[0] == abc[2]) {
                System.out.println("equilateral");
            }

            else if (abc[0] == abc[1] || abc[0] == abc[2] || abc[1] == abc[2]) {
                System.out.println("isosceles");
            }

            else {
                System.out.println("scalene");
            }
        }
    }
}
