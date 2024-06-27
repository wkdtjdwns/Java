import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> oddNums = new ArrayList<>();
        for (int i = 0; i < 7; i++) {
            int n = Integer.parseInt(br.readLine());
            if (n % 2 == 1) {
                oddNums.add(n);
            }
        }

        if (oddNums.size() > 0) {
            int sum = 0;
            int min = 100;

            for (int n : oddNums) {
                sum += n;

                if (n < min) {
                    min = n;
                }
            }

            System.out.println(sum);
            System.out.println(min);
        }

        else {
            System.out.println(-1);
        }
    }
}
