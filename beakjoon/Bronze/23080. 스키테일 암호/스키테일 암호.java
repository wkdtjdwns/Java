import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(br.readLine());
        String str = br.readLine();
        for (int i = 0; i < str.length(); i += k) {
            System.out.print(str.charAt(i));
        }
    }
}
