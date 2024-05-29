import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        String[] promises = {
                "Never gonna give you up",
                "Never gonna let you down",
                "Never gonna run around and desert you",
                "Never gonna make you cry",
                "Never gonna say goodbye",
                "Never gonna tell a lie and hurt you",
                "Never gonna stop"
        };
        List<String> promiseList = new ArrayList<>(Arrays.asList(promises));

        boolean check = false;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String p = br.readLine();

            if (!promiseList.contains(p)) {
                check = true;
            }
        }

        if (check) {
            System.out.println("Yes");
        }

        else {
            System.out.println("No");
        }
    }
}
