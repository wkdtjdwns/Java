import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n + 1];
        a[0] = 0;

        HashSet<Integer> set = new HashSet<>();
        set.add(0);

        for (int i = 1; i <= n; i++) {
            int pre = a[i - 1];
            int temp = pre - i;
            if (temp < 0 || set.contains(temp)) {
                temp = pre + i;
            }

            a[i] = temp;
            set.add(temp);
        }

        System.out.println(a[n]);
    }
}
