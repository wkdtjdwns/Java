import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double w = Double.parseDouble(br.readLine()) * 2;
        System.out.println((int)(Math.sqrt(w) * 4));
    }
}
