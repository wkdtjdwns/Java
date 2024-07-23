import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> results = new ArrayList<>();
        for (int i = 0; i < 31; i++) {
            results.add((int)Math.pow(2, i));
        }

        int n = Integer.parseInt(br.readLine());
        if (results.contains(n)) {
            System.out.println(1);
        }

        else {
            System.out.println(0);
        }
    }
}
