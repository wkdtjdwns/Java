import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String subjectCode = br.readLine();
        int n = Integer.parseInt(br.readLine());

        int cnt = 0;
        for (int i = 0; i < n; i++) {
            String code = br.readLine();

            if (subjectCode.substring(0, 5).equals(code.substring(0, 5))) {
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}
