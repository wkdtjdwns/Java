import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<Integer, String> m = new HashMap<Integer, String>();
        m.put(1, "Yakk");
        m.put(2, "Doh");
        m.put(3, "Seh");
        m.put(4, "Ghar");
        m.put(5, "Bang");
        m.put(6, "Sheesh");

        int t = Integer.parseInt(br.readLine());
        for (int i = 1; i <= t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            if (a == b) {
                switch (a) {
                    case 1:
                        System.out.printf("Case %d: Habb Yakk\n", i);
                        break;

                    case 2:
                        System.out.printf("Case %d: Dobara\n", i);
                        break;

                    case 3:
                        System.out.printf("Case %d: Dousa\n", i);
                        break;

                    case 4:
                        System.out.printf("Case %d: Dorgy\n", i);
                        break;

                    case 5:
                        System.out.printf("Case %d: Dabash\n", i);
                        break;

                    case 6:
                        System.out.printf("Case %d: Dosh\n", i);
                        break;
                }
            }

            else {
                int h = Math.max(a, b);
                int l = Math.min(a, b);

                if ((h == 6 && l == 5) || (h == 5 && l == 6)) {
                    System.out.printf("Case %d: Sheesh Beesh\n", i);
                } else {
                    System.out.printf("Case %d: %s %s\n", i, m.get(h), m.get(l));
                }
            }
        }
    }
}
