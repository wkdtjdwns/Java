import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int front = 0;
        int back = 0;

        for (int i = 0; i < str.length(); i++) {
            if (i < str.length() / 2) {
                front += str.charAt(i) - '0';
            }

            else {
                back += str.charAt(i) - '0';
            }
        }

        if (front == back) {
            System.out.println("LUCKY");
        }

        else {
            System.out.println("READY");
        }
    }
}
