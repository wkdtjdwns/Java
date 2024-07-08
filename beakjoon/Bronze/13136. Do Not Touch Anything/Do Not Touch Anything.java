import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        double r = Double.parseDouble(st.nextToken());
        double c = Double.parseDouble(st.nextToken());
        double n = Double.parseDouble(st.nextToken());

        long rCctv = (long) Math.ceil(r / n);
        long cCctv = (long) Math.ceil(c / n);

        long result = rCctv * cCctv;

        System.out.println(result);
    }
}
