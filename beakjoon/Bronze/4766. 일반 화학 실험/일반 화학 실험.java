import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double n = Double.parseDouble(br.readLine());

        while(true) {
            double n2 = Double.parseDouble(br.readLine());
            if (n2 == 999) {
                break;
            }

            System.out.println(String.format("%.2f", (n2 - n)));
            n = n2;
        }
    }
}
