import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());

        int[] delivery = new int[3];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 3; i++) {
            int n = Integer.parseInt(st.nextToken());
            int fDog = n % (a + b);
            int sDog = n % (c + d);
            int cnt = 0;

            if (fDog <= a && sDog <= c) {
                cnt = 2;
            }
            
            else if (fDog <= a || sDog <= c) {
                cnt = 1;
            }

            if (fDog == 0) {
                cnt -= 1;
            }
            
            if (sDog == 0) {
                cnt -= 1;
            }

            System.out.println(cnt);
        }
    }
}
