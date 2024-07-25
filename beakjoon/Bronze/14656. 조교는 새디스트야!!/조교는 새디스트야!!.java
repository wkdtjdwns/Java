import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] people = new int[n];
        for (int i = 0; i < n; i++) {
            people[i] = i + 1;
        }

        StringTokenizer st = new StringTokenizer(br.readLine());
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (people[i] != Integer.parseInt(st.nextToken())) {
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}
