import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(n);

        ArrayList<Integer> sequence = new ArrayList<>();
        sequence.add(1);
        sequence.add(2);

        int next = 3;
        for (int i = 3; i < n; i++) {
            sequence.add(next);
            next += 2;
        }

        while (!isPrime(next)) {
            next++;
        }
        sequence.add(next);

        for (int i = 0; i < sequence.size(); i++) {
            System.out.print(sequence.get(i));
            if (i < sequence.size() - 1) {
                System.out.print(" ");
            }
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}
