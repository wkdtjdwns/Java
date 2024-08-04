import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int fk = k % 10;
        int f2k = 2 * k % 10;
        ArrayList<Integer> f = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            int fx = i % 10;
            if (fx != fk && fx != f2k) {
                f.add(i);
            }
        }

        System.out.println(f.size());
        for (int i : f) {
            System.out.print(i + " ");
        }
    }
}
