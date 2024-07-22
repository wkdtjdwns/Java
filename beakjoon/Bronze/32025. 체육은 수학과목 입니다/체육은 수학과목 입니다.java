import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double h = Double.parseDouble(br.readLine());
        double w = Double.parseDouble(br.readLine());

        System.out.println((int)Math.floor(Math.min(h, w) / 2 * 100));
    }
}
