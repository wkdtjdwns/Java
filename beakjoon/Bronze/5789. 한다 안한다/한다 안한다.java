import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            int a = str.length() / 2 - 1;
            int b = str.length() / 2;

            if (str.charAt(a) == str.charAt(b)) {
                System.out.println("Do-it");
            }

            else {
                System.out.println("Do-it-Not");
            }
        }
    }
}
