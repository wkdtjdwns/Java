import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Double> scroes = new HashMap<>();
        scroes.put("A+", 4.3);
        scroes.put("A0", 4.0);
        scroes.put("A-", 3.7);
        scroes.put("B+", 3.3);
        scroes.put("B0", 3.0);
        scroes.put("B-", 2.7);
        scroes.put("C+", 2.3);
        scroes.put("C0", 2.0);
        scroes.put("C-", 1.7);
        scroes.put("D+", 1.3);
        scroes.put("D0", 1.0);
        scroes.put("D-", 0.7);
        scroes.put("F", 0.0);

        System.out.println(scroes.get(br.readLine()));
    }
}
