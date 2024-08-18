import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out, true);
        int a = 0;
        int b = 0;
        for (int i = 1; i <= 9; i++) {
            pw.println("? A " + i);
            int response = Integer.parseInt(br.readLine());
            if (response == 1) {
                a = i;
                break;
            }
        }

        for (int i = 1; i <= 9; i++) {
            pw.println("? B " + i);
            int response = Integer.parseInt(br.readLine());
            if (response == 1) {
                b = i;
                break;
            }
        }

        pw.println("! " + (a + b));
    }
}
