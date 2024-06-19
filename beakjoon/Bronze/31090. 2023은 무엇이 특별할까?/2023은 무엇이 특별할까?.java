import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int year = Integer.parseInt(br.readLine());
            int n = year % 100;
            
            if ((year + 1) % n == 0) {
                System.out.println("Good");
            }
            
            else {
                System.out.println("Bye");
            }
        }
    }
}
