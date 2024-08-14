import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] x = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            x[i] = Integer.parseInt(st.nextToken());
        }

        int[] l = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            l[i] = Integer.parseInt(st.nextToken());
        }

        char[] c = new char[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            c[i] = st.nextToken().charAt(0);
        }

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (Math.abs(x[i] - x[j]) <= l[i] + l[j]) {
                    if (c[i] != c[j]) {
                        System.out.println("YES");
                        System.out.println((i + 1) + " " + (j + 1));
                        return;
                    }
                }
            }
        }

        System.out.println("NO");
    }
}
