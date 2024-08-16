import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int floor = Integer.parseInt(br.readLine());
        String animal = br.readLine();
        int cur = Integer.parseInt(br.readLine());
        int result = 0;

        if (animal.equals("annyong") && cur % 2 != 0) {
            result = cur;
        }

        else if (animal.equals("annyong") && cur % 2 == 0) {
            if (cur == -1) {
                result = cur + 1;
            }

            else {
                result = cur - 1;
            }
        }

        else if (animal.equals("induck") && cur % 2 == 0) {
            result = cur;
        }

        else if (animal.equals("induck") && cur % 2 != 0) {
            if (cur - 1 == 0) {
                result = cur + 1;
            }

            else {
                result = cur - 1;
            }
        }

        System.out.println(result);
    }
}
