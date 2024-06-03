import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        for (int i = 0; i < 3; i++) {
            st = new StringTokenizer(br.readLine());

            int h1 = Integer.parseInt(st.nextToken());
            int m1 = Integer.parseInt(st.nextToken());
            int s1 = Integer.parseInt(st.nextToken());
            int h2 = Integer.parseInt(st.nextToken());
            int m2 = Integer.parseInt(st.nextToken());
            int s2 = Integer.parseInt(st.nextToken());

            int t1 = h1 * 3600 + m1 * 60 + s1;
            int t2 = h2 * 3600 + m2 * 60 + s2;
            int t = t2 - t1;

            int h = t / 3600 % 24;
            int m = t / 60 % 60;
            int s = t % 60;

            System.out.println(h + " " + m + " " + s);
        }
    }
}
