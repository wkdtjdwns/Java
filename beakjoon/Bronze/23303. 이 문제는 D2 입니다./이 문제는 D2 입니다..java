import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        if (str.contains("D2") || str.contains("d2")) {
            System.out.println("D2");
        }

        else {
            System.out.println("unrated");
        }
    }
}
