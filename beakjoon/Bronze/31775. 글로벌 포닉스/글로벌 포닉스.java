import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        boolean isStartL = false;
        boolean isStartK = false;
        boolean isStartP = false;

        for (int i = 0; i < 3; i++) {
            String str = br.readLine();
            if (str.startsWith("l")) {
                isStartL = true;
            }

            else if (str.startsWith("k")) {
                isStartK = true;
            }

            else if (str.startsWith("p")) {
                isStartP = true;
            }
        }

        if (isStartL && isStartK && isStartP) {
            System.out.println("GLOBAL");
        }

        else {
            System.out.println("PONIX");
        }
    }
}
