import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int[] stock = new int[3];
        for (int j = 0; j < t; j++) {
            int maxValue = 0;
            int n = Integer.parseInt(br.readLine());
            for (int i = 0; i < n; i++){
                StringTokenizer st = new StringTokenizer(br.readLine());
                stock[0] = Integer.parseInt(st.nextToken());
                stock[1] = Integer.parseInt(st.nextToken());
                stock[2] = Integer.parseInt(st.nextToken());

                if (stock[0] < 0 && stock[1] < 0 & stock[2] < 0) {
                    continue;
                }

                maxValue += Math.max(Math.max(stock[0], stock[1]), stock[2]);
            }

            System.out.println(maxValue);
        }
    }
}
