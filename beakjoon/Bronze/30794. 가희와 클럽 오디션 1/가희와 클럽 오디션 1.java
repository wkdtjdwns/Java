import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int lv = Integer.parseInt(st.nextToken());
        String sign = st.nextToken();
        
        if (sign.equals("miss")) {
            System.out.println(0);
        }
        
        else if (sign.equals("bad")) {
            System.out.println(200 * lv);
        }
        
        else if (sign.equals("cool")) {
            System.out.println(400 * lv);
        }
        
        else if (sign.equals("great")) {
            System.out.println(600 * lv);
        }
        
        else {
            System.out.println(lv * 1000);
        }
    }
}
