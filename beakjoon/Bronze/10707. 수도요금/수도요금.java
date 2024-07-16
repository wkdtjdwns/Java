import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        int d = Integer.parseInt(br.readLine());
        int p = Integer.parseInt(br.readLine());
        
        int x = a * p;
        int y = 0;

        if (c >= p) {
            y = b;
        }
        
        else {
            y = b + ((p - c) * d);
        }
        
        if (x < y) {
            System.out.println(x);
        }
        
        else {
            System.out.println(y);
        }
    }
}
