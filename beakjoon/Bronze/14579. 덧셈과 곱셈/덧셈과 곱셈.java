import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int temp = (a + 1) * a / 2 % 14579;
        int result = temp;
        for (int i = a + 1; i <= b; i++){
            result *= (temp += i);
            result %= 14579;
        }

        System.out.println(result);
    }
}
