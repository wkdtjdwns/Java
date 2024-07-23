import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), ":");
        int curH = Integer.parseInt(st.nextToken());
        int curM = Integer.parseInt(st.nextToken());
        int curS = Integer.parseInt(st.nextToken());
        int cur = curH * 3600 + curM * 60 + curS;

        st = new StringTokenizer(br.readLine(), ":");
        int saltH = Integer.parseInt(st.nextToken());
        int saltM = Integer.parseInt(st.nextToken());
        int saltS = Integer.parseInt(st.nextToken());
        int salt = saltH * 3600 + saltM * 60 + saltS;

        int need = salt - cur;
        if (need <= 0) {
            need += 24 * 3600;
        }

        System.out.printf("%02d:%02d:%02d", need / 3600, (need % 3600) / 60, need % 60);
    }
}
