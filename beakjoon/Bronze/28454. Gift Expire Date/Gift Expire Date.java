import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String date = br.readLine();
        int n = Integer.parseInt(br.readLine());
        int result = 0;

        for (int i = 0; i < n; i++) {
            String gift = br.readLine();
            if (gift.compareTo(date) >= 0) {
                result++;
            }
        }

        System.out.println(result);
    }
}
