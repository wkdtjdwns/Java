import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        
        int cnt = 0;
        for (int i = 0; i < str.length() - 3; i++) {
            if (str.charAt(i) == 'D' && str.charAt(i + 1) == 'K' && 
                    str.charAt(i + 2) == 'S' && str.charAt(i + 3) == 'H') {
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}
