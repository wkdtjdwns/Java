import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int[] changes = {25, 10, 5, 1};
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            int c = Integer.parseInt(br.readLine());
            int[] result = new int[4];

            for (int j = 0; j < changes.length; j++) {
                result[j] = c / changes[j];
                c %= changes[j];
            }

            for (int res : result) {
                System.out.print(res + " ");
            }
        }
    }
}
