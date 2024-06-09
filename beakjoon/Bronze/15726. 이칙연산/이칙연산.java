import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        double a = Double.parseDouble(st.nextToken());
        double b = Double.parseDouble(st.nextToken());
        double c = Double.parseDouble(st.nextToken());

        int x = (int)((a * b) / c);
        int y = (int)((a / b) * c);

        if (x > y) {
            System.out.println(x);
        }

        else {
            System.out.println(y);
        }
    }
}
