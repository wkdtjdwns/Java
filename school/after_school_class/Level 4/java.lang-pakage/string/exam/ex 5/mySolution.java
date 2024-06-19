package lang.string.Ex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex5 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), ":");

        int h1 = Integer.parseInt(st.nextToken());
        int m1 = Integer.parseInt(st.nextToken());
        int s1 = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine(), ":");
        int h2 = Integer.parseInt(st.nextToken());
        int m2 = Integer.parseInt(st.nextToken());
        int s2 = Integer.parseInt(st.nextToken());

        int h = h2 - h1;
        int m = m2 - m1;
        int s = s2 - s1;

        if (s < 0) {
            m--;
            s += 60;
        }

        if (m < 0) {
            h--;
            m += 60;
        }

        if (h < 0) {
            h += 24;
        }

        System.out.printf("%02d:%02d:%02d", h, m, s);
    }
}
