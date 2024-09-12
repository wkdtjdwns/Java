import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static class Score {
        int n, s, c, l;

        public Score(int n, int s, int c, int l) {
            this.n = n;
            this.s = s;
            this.c = c;
            this.l = l;
        }
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayList<Score> scores = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            int l = Integer.parseInt(st.nextToken());

            scores.add(new Score(i + 1, s, c, l));
        }

        scores.sort((p1, p2) -> {
            if (p1.s != p2.s) {
                return Integer.compare(p2.s, p1.s);
            }

            else if (p1.c != p2.c) {
                return Integer.compare(p1.c, p2.c);
            }

            else {
                return Integer.compare(p1.l, p2.l);
            }
        });

        System.out.println(scores.get(0).n);
    }
}
