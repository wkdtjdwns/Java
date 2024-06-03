import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long n = Long.parseLong(br.readLine());
        for (long i = 0; i < n; i++) {
            String name = br.readLine();
            System.out.println(name.toLowerCase());
        }
    }
}
