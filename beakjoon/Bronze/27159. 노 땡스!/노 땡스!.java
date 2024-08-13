import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] array = new int[36];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            array[Integer.parseInt(st.nextToken())]++;
        }

        int sum = 0;
        for (int i = 3; i <= 35; i++) {
            if (array[i - 1] == 0 && array[i] != 0) {
                sum += i;
            }
        }

        System.out.println(sum);
    }
}
