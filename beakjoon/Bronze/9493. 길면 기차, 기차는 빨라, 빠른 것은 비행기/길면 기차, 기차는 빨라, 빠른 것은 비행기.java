import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            double M = Double.parseDouble(st.nextToken());
            double a = Double.parseDouble(st.nextToken());
            double b = Double.parseDouble(st.nextToken());

            if (M == 0 && a == 0 & b == 0) break;

            double result = Double.parseDouble(String.format("%.0f", (((M / a) - (M / b)) * 3600)));

            int h = (int) (result / 3600);
            int m = (int) ((result / 60) % 60);
            int s = (int) (result % 60);

            System.out.format("%d:%02d:%02d\n", h, m, s);
        }
    }
}
