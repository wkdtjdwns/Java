import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int level = Integer.parseInt(br.readLine());
        if (level < 206) {
            System.out.println(1);
        }
        
        else if (level < 218) {
            System.out.println(2);
        }

        else if (level < 229) {
            System.out.println(3);
        }
        
        else {
            System.out.println(4);
        }
    }
}
