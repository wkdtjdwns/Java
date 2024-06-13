import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String myMbti = br.readLine();
        int n = Integer.parseInt(br.readLine());
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            String mbti = br.readLine();
            
            if (myMbti.equals(mbti)) {
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}
