import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int p = Integer.parseInt(br.readLine());
        int sw = 0;
        int em = 0;
        int ai = 0;
        int no = 0;
        for (int i = 0; i < p; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int grade = Integer.parseInt(st.nextToken());
            int classNum = Integer.parseInt(st.nextToken());

            if (grade == 1) {
                no++;
            }

            else if (classNum <= 2) {
                sw++;
            }

            else if (classNum == 3) {
                em++;
            }

            else {
                ai++;
            }
        }

        System.out.println(sw);
        System.out.println(em);
        System.out.println(ai);
        System.out.println(no);
    }
}
