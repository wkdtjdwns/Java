import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int i = 1; i <= t; i++) {
            String[] gan = br.readLine().split(" ");
            String[] sau = br.readLine().split(" ");

            int ganScore = Integer.parseInt(gan[0]) + Integer.parseInt(gan[1]) * 2 + Integer.parseInt(gan[2]) * 3
                    + Integer.parseInt(gan[3]) * 3 + Integer.parseInt(gan[4]) * 4 + Integer.parseInt(gan[5]) * 10;

            int sauScore = Integer.parseInt(sau[0]) + Integer.parseInt(sau[1]) * 2 + Integer.parseInt(sau[2]) * 2
                    + Integer.parseInt(sau[3]) * 2 + Integer.parseInt(sau[4]) * 3 + Integer.parseInt(sau[5]) * 5
                    + Integer.parseInt(sau[6]) * 10;

            if (ganScore > sauScore) {
                System.out.printf("Battle %d: Good triumphs over Evil\n", i);
            }

            else if (ganScore < sauScore) {
                System.out.printf("Battle %d: Evil eradicates all trace of Good\n", i);
            }

            else {
                System.out.printf("Battle %d: No victor on this battle field\n", i);
            }
        }
    }
}
