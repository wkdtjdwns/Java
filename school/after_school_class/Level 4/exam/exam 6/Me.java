package solveExam.exam6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Me {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        long x = Long.parseLong(st.nextToken());

        long[] c = new long[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            c[i] = Integer.parseInt(st.nextToken());
        }

        long[] s = new long[m];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            s[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(c);
        Arrays.sort(s);

        int start = 0;
        int end = Math.min(n, m);
        while (end - start > 10) {
            int mid = (start + end) / 2;
            if (calc(mid, c, s, m, x)) {
                start = mid;
            }

            else {
                end = mid - 1;
            }
        }

        for (int i = end; i >= start; i--) {
            if (calc(i, c, s, m, x)) {
                System.out.println(i);
                return;
            }
        }
    }

    public static boolean calc(int num, long[] c, long[] s, int m, long x) {
        long balance = 0;

        for (int i = 0; i < num; i++) {
            if (c[i] > s[m - num + i])
                balance += c[i] - s[m - num + i];
        }

        return balance <= x;
    }
}
