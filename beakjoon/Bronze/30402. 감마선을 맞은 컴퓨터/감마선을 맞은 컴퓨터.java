import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        for (int i = 0; i < 15; i++) {
            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < 15; j++) {
                String pixel = st.nextToken();
                if (pixel.equals("w")) {
                    System.out.println("chunbae");
                    return;
                }

                else if (pixel.equals("b")) {
                    System.out.println("nabi");
                    return;
                }

                else if (pixel.equals("g")) {
                    System.out.println("yeongcheol");
                    return;
                }
            }
        }
    }
}
