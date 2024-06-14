import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int x = 0;
        int y = 0;

        String win = "";
        for (int i = 0; i < n; i++) {
            win = br.readLine();
            if (win.equals("D")){
                x++;
            }

            else {
                y++;
            }

            if (Math.abs(x - y) >= 2) {
                break;
            }
        }

        System.out.println(x + ":" + y);
    }
}
