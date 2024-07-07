import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            double a = Double.parseDouble(st.nextToken());
            double b = Double.parseDouble(st.nextToken());
            double c = Double.parseDouble(st.nextToken());
            double d = Double.parseDouble(st.nextToken());
            double e = Double.parseDouble(st.nextToken());

            double result = (a * 350.34) + (b * 230.90) + (c * 190.55) + (d * 125.30) + (e * 180.90);
            System.out.printf("$%.2f\n", result);
        }
    }
}
