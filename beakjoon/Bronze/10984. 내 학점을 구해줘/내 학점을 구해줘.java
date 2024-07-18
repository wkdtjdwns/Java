import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int C = 0;
            double G = 0;

            int n = Integer.parseInt(br.readLine());
            for (int j = 0; j < n; j++) {
                st = new StringTokenizer(br.readLine());
                double c = Double.parseDouble(st.nextToken());
                double g = Double.parseDouble(st.nextToken());

                C += c;
                G += c * g;
            }

            System.out.println(C + " " + String.format("%.1f", G / C));
        }
    }
}
