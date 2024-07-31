import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayList<String> names = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String name = br.readLine();
            names.add(name);
        }
        
        if (names.contains("anj")) {
            System.out.println("뭐야;");
        }
        
        else {
            System.out.println("뭐야?");
        }
    }
}
