import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] color = {
                "black", "brown", "red", "orange", "yellow", 
                "green", "blue", "violet", "grey", "white"
        };
        String a = br.readLine();
        String b = br.readLine();
        String c = br.readLine();
        long result = (Arrays.asList(color).indexOf(a) * 10) + Arrays.asList(color).indexOf(b);
        result *= Math.pow(10, Arrays.asList(color).indexOf(c));

        System.out.println(result);
    }
}
