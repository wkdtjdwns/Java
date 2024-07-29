import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        char[] str = br.readLine().toCharArray();
        int bCnt = 0; int sCnt = 0; int aCnt = 0;
        for (int i = 0; i < n; i++) {
            if (str[i] == 'B') {
                bCnt++;
            }

            else if (str[i] == 'S') {
                sCnt++;
            }

            else if (str[i] == 'A') {
                aCnt++;
            }
        }

        int maxValue = Math.max(Math.max(bCnt, sCnt), aCnt);
        if (bCnt == sCnt && sCnt == aCnt) {
            System.out.println("SCU");
        }

        else {
            if (bCnt == maxValue) {
                System.out.print("B");
            }

            if (sCnt == maxValue) {
                System.out.print("S");
            }


            if (aCnt == maxValue) {
                System.out.print("A");
            }
        }
    }
}
