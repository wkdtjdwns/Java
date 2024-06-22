import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int x1, y1, x2, y2 = 0;
        if (a % 4 == 0) {
            x1 = a / 4;
            y1 = 1;
        }

        else {
            x1 = (a / 4) + 1;
            y1 = 5 - (a % 4);
        }

        if (b % 4 == 0) {
            x2 = b / 4;
            y2 = 1;
        }

        else {
            x2 = (b / 4) + 1;
            y2 = 5 - (b % 4);
        }

        System.out.println(Math.abs(x2 - x1) + Math.abs(y2 - y1));
    }
}
