import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        double low = 0;
        double high = Math.min(Math.min(l, w), h);
        while (low < high) {
            double mid = (low + high) / 2;
            if ( (long)(l / mid) * (long)(w / mid) * (long)(h / mid) < n ) {
                if (high == mid) {
                    break;
                }

                high = mid;
            }

            else {
                if (low == mid) {
                    break;
                }

                low = mid;
            }
        }

        System.out.println(low);
    }
}
