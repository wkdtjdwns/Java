import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()) % 2;
        if (n == 0) {
            System.out.println("SciComLove");
        }

        else {
            System.out.println("evoLmoCicS");
        }
    }
}
