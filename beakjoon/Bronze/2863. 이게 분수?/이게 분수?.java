import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        double a = Integer.parseInt(st.nextToken());
        double b = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        double c = Integer.parseInt(st.nextToken());
        double d = Integer.parseInt(st.nextToken());

        ArrayList<Double> results = new ArrayList<>();
        results.add((a / c) + (b / d));
        results.add((c / d) + (a / b));
        results.add((d / b) + (c / a));
        results.add((b / a) + (d / c));

        double max = 0;
        for (double n : results) {
            if (n > max) {
                max = n;
            }
        }

        System.out.println(results.indexOf(max));
    }
}
