import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int total = 0;
        for (int i = 0; i < 10; i++) {
            total += Integer.parseInt(br.readLine());
        }
        
        if (total % 4 == 0) {
            System.out.println("N");
        }
        
        else if (total % 4 == 1) {
            System.out.println("E");
        }
        
        else if (total % 4 == 2) {
            System.out.println("S");
        }
        
        else {
            System.out.println("W");
        }
    }
}
