import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        double w = Double.parseDouble(st.nextToken());
        double h = Double.parseDouble(st.nextToken());

        System.out.println( String.format("%.1f", (w * h / 2)) );
    }
}
