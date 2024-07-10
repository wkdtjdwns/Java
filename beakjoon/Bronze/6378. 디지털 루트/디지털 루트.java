import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String str = br.readLine();
            if (str.equals("0")) {
                break;
            }

            while (true) {
                int sum = 0;

                if (str.length() < 2) {
                    break;
                }
                
                else {
                    for (int i = 0; i < str.length(); i++) {
                        sum += str.charAt(i) - '0';
                    }
                }
                
                str = String.valueOf(sum);
            }
            
            System.out.println(str);
        }
    }
}
