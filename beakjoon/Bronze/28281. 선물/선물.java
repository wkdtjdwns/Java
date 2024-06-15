import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }

        int[] price = new int[n - 1];
        for (int i = 0; i < n - 1; i++) {
            price[i] = (a[i] + a[i + 1]) * x;
        }

        int min = Integer.MAX_VALUE;
        for (int p : price) {
            if (p < min) {
                min = p;
            }
        }

        System.out.println(min);
    }
}
