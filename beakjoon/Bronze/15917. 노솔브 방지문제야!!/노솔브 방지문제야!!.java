import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Long> nums = new ArrayList<>();
        for (int i = 0; i < 32; i++) {
            nums.add((long)Math.pow(2, i));
        }

        int q = Integer.parseInt(br.readLine());
        for (int i = 0; i < q; i++) {
            long n = Long.parseLong(br.readLine());
            System.out.println(nums.contains(n) ? 1 : 0);
        }
    }
}
