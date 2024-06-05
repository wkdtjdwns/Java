import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int month = Integer.parseInt(br.readLine());
        int day = Integer.parseInt(br.readLine());

        if (month < 2) {
            System.out.println("Before");   
        }
        
        else if (month == 2) {
            
            if (day < 18) {
                System.out.println("Before");
            }
                
            else if (day > 18) {
                System.out.println("After");
            }
                
            else {
                System.out.println("Special");   
            }
        }
        
        else {
            System.out.println("After");   
        }
    }
}
