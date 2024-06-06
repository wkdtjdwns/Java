import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();

        String str = br.readLine();
        char[] chars = str.toCharArray();
        int sum = 0;
        for (char c : chars) {
            sum += Integer.parseInt(String.valueOf(c));
        }

        System.out.println(sum);
    }
}
