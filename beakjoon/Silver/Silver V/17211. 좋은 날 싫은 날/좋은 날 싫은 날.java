import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        double a = (m == 0) ? 1.0 : 0.0;
        double b = (m == 1) ? 1.0 : 0.0;

        st = new StringTokenizer(br.readLine());
        double c = Double.parseDouble(st.nextToken());
        double d = Double.parseDouble(st.nextToken());
        double e = Double.parseDouble(st.nextToken());
        double f = Double.parseDouble(st.nextToken());


        for (int i = 0; i < n; i++) {
            double tempA = a * c + b * e;
            double tempB = a * d + b * f;
            a = tempA;
            b = tempB;
        }

        System.out.println(Math.round(a * 1000));
        System.out.println(Math.round(b * 1000));
    }
}
