import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        
        int result = 0;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int width = Integer.parseInt(st.nextToken());
            
            if (width == 136) {
                result += 1000;
            }
            
            else if (width == 142) {
                result += 5000;
            }

            else if (width == 148) {
                result += 10000;
            }

            else {
                result += 50000;
            }
        }

        System.out.println(result);
    }
}
