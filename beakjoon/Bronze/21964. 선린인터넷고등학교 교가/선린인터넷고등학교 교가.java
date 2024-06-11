import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String n = br.readLine();
        String str = br.readLine();

        for (int i = 5; i > 0; i--) {
            System.out.print(str.charAt(str.length() - i));
        }
    }
}
