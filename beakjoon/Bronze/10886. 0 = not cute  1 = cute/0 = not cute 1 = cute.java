import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int cute = 0;
        int not = 0;
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());
            if (num == 1) {
                cute++;
            }

            else {
                not++;
            }
        }

        if (cute > not) {
            System.out.println("Junhee is cute!");
        }
        
        else {
            System.out.println("Junhee is not cute!");
        }
    }
}
