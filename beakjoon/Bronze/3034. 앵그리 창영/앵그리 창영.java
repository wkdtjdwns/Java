import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());

            if (num <= w) {
                System.out.println("DA");
            }
            
            else if (num <= h) {
                System.out.println("DA");
            }
            
            else if (num <= Math.sqrt(Math.pow(w, 2) + Math.pow(h, 2))) {
                System.out.println("DA");
            }
            
            else {
                System.out.println("NE");
            }
        }
    }
}
