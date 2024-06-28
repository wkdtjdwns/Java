import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int i = 1;
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            double a = Double.parseDouble(st.nextToken());
            double b = Double.parseDouble(st.nextToken());
            double c = Double.parseDouble(st.nextToken());

            if(b == 0) {
                break;
            }

            c = (c / 60) / 60;

            double distance = ((((a * 3.1415927) * b) / 12) / 5280);
            double mph = (distance / c);

            System.out.printf("Trip #%d: %.2f %.2f\n", i, distance, mph);

            i++;
        }
    }
}
