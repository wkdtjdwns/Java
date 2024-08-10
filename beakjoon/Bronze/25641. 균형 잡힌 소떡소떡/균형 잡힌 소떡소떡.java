import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        String str = br.readLine();
        int sCnt = 0;
        int tCnt = 0;
        for (int i = 0; i < t; i++) {
            if (str.charAt(i) == 's') {
                sCnt++;
            }

            else {
                tCnt++;
            }
        }

        for (int i = 0; i < t; i++) {
            if (sCnt == tCnt) {
                System.out.println(str.substring(i));
                break;
            }

            else if (str.charAt(i) == 's') {
                sCnt--;
            }

            else {
                tCnt--;
            }
        }
    }
}
