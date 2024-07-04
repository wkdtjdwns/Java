import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int b = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());

            int num1 = 0;
            int num2 = 0;

            if (b == 0 && n == 0) {
                break;
            }

            int a = 0;
            while (true) {
                if (Math.pow(a, n) <= b) {
                    num1 = a;
                }
                
                else if (Math.pow(a, n) > b){
                    num2 = a;
                    break;
                }
                
                a++;
            }
            
            int result = (Math.abs(Math.pow(num1, n) - b) <= Math.abs(Math.pow(num2, n) - b)) ? num1 : num2;

            System.out.println(result);
        }
    }
}
