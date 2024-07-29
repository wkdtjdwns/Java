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

        int root = (int)Math.sqrt(a * a - b);
        int result1 = (-1 * a) - root;
        int result2 = (-1 * a) + root;

        if (result1 == result2) {
            System.out.println(result1);
        }

        else {
            System.out.println(result1 + " " + result2);
        }
    }
}
