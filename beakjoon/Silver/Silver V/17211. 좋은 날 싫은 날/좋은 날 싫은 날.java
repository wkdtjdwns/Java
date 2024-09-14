import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        double m = Double.parseDouble(st.nextToken());

        double[] arr = Arrays.stream(br.readLine().split(" ")).mapToDouble(Double::parseDouble).toArray();
        m = (m - 1) * 1000;
        for (int i = 0; i < n; i++) {
            m = m * arr[0] + (1000 - m) * arr[2];
        }

        System.out.println(String.format("%.0f", m));
        System.out.println(String.format("%.0f", 1000 - m));
    }
}
