import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int k1 = Integer.parseInt(st.nextToken());
        char o1 = st.nextToken().charAt(0);
        int k2 = Integer.parseInt(st.nextToken());
        char o2 = st.nextToken().charAt(0);
        int k3 = Integer.parseInt(st.nextToken());

        int result1 = calc(calc(k1, o1, k2), o2, k3);
        int result2 = calc(k1, o1, calc(k2, o2, k3));

        if (result1 < result2) {
            System.out.println(result1);
            System.out.println(result2);
        }
        
        else {
            System.out.println(result2);
            System.out.println(result1);
        }
    }

    static int calc(int a, char op, int b) {
        int result = 0;
        switch (op) {
            case '+': result = a + b; break;
            case '-': result = a - b; break;
            case '*': result = a * b; break;
            case '/': result = a / b; break;
        }

        return result;
    }
}
