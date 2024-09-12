import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;

        while ((line = br.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(line);

            double x1 = Double.parseDouble(st.nextToken());
            double y1 = Double.parseDouble(st.nextToken());

            double x2 = Double.parseDouble(st.nextToken());
            double y2 = Double.parseDouble(st.nextToken());

            double x3 = Double.parseDouble(st.nextToken());
            double y3 = Double.parseDouble(st.nextToken());

            double x4 = Double.parseDouble(st.nextToken());
            double y4 = Double.parseDouble(st.nextToken());

            double x, y;
            if (x1 == x3 && y1 == y3) {
                x = x2 + x4 - x1;
                y = y2 + y4 - y1;
            }

            else if (x1 == x4 && y1 == y4) {
                x = x2 + x3 - x1;
                y = y2 + y3 - y1;
            }

            else if (x2 == x3 && y2 == y3) {
                x = x1 + x4 - x2;
                y = y1 + y4 - y2;
            }

            else {
                x = x1 + x3 - x2;
                y = y1 + y3 - y2;
            }

            System.out.printf("%.3f %.3f\n", x, y);
        }
    }
}
