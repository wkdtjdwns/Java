import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        n /= 100;
        n *= 100;
        
        int f = Integer.parseInt(br.readLine());
        int result = 0;
        while (n % f != 0) {
            n++;
            result++;
        }
        
        if (result < 10) {
            System.out.println("0" + result);
        }
        
        else {
            System.out.println(result);
        }
    }
}
