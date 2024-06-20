import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        if (str.startsWith("\"") && str.endsWith("\"") && str.length() > 2) {
            for (int i = 1; i < str.length() - 1; i++) {
                System.out.print(str.charAt(i));
            }
        }

        else {
            System.out.println("CE");
        }
    }
}
