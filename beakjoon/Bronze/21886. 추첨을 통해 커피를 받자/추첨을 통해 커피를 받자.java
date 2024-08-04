import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int num = 100;
        int sum = 0;
        for (int i = 0; i < 9; i++) {
            int n = Integer.parseInt(st.nextToken());
            if (i % 2 == 0 && i != 0) {
                num += 100;
            }
            
            sum += n;
            if (n > num) {
                System.out.println("hacker");
                return;
            }
        }
        
        System.out.println(sum < 100 ? "none" : "draw");
    }
}
