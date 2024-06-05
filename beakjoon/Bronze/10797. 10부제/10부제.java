import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int cnt = 0;

        int day = Integer.parseInt(br.readLine());

        int[] nums = new int[5];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 5; i++) {
            if (Integer.parseInt(st.nextToken()) == day) {
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}
