import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(br.readLine());
        for (int i = 1; i <= k; i++) {
            int h = Integer.parseInt(br.readLine());
            String action = br.readLine();
            for (char c : action.toCharArray()) {
                if (c == 'c') {
                    h++;
                }
                
                else {
                    h--;
                }
            }

            System.out.println("Data Set " + i + ":");
            System.out.println(h + "\n");
        }
    }
}
