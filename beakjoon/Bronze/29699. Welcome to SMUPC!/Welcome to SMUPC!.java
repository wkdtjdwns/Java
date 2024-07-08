import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String str = "WelcomeToSMUPC";

        if (n >= 1 && n < 15) {
            System.out.println(str.charAt(n - 1));
        }
        
        if (n == 15) {
            System.out.println(str.charAt(0));
        }
        
        if (n > 15) {
            if ((n % 14) == 0) {
                System.out.println(str.charAt(13));
            }
            
            if ((n % 14) != 0) {
                System.out.println(str.charAt((n % 14) - 1));
            }
        }
    }
}
