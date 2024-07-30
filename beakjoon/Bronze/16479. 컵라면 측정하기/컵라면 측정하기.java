import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

    static Map<String, String> win = new HashMap<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int d1 = Integer.parseInt(st.nextToken());
        int d2 = Integer.parseInt(st.nextToken());

        double r1 = d1 / 2.0;
        double r2 = d2 / 2.0;
        double height = Math.sqrt(k * k - (r1 - r2) * (r1 - r2)) * Math.sqrt(k * k - (r1 - r2) * (r1 - r2));;

        System.out.println(height);
    }
}
