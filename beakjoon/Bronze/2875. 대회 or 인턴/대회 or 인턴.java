import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String line = br.readLine();
        String[] split = line.split(" ");

        int n = Integer.parseInt(split[0]);
        int m = Integer.parseInt(split[1]);
        int k = Integer.parseInt(split[2]);
        int result = 0;

        while (n >= 2 && m >= 1 && (n + m) - k >= 3) {
            result++;
            n -= 2;
            m--;
        }
        
        System.out.println(result);
    }
}
