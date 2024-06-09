import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        if (input.charAt(1) == '0') {
            System.out.println(10 + Integer.parseInt(input.substring(2)));
        }

        else {
            System.out.println(Character.getNumericValue(input.charAt(0)) + Integer.parseInt(input.substring(1)));
        }
    }
}
