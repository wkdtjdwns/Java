import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        int[][] people = new int[n][4];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            people[i][0] = Integer.parseInt(st.nextToken());
            people[i][1] = Integer.parseInt(st.nextToken());
            people[i][2] = Integer.parseInt(st.nextToken());
            people[i][3] = i + 1;
        }

        int win = 0;
        for (int i = 1; i < n; i++) {
            if (people[i][0] > people[win][0] ||
                    (people[i][0] == people[win][0] && people[i][1] < people[win][1]) ||
                    (people[i][0] == people[win][0] && people[i][1] == people[win][1] && people[i][2] < people[win][2])) {

                win = i;
            }
        }

        System.out.println(people[win][3]);
    }
}
