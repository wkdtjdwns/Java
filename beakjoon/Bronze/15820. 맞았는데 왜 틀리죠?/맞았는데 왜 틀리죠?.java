import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int s1 = Integer.parseInt(st.nextToken());
        int s2 = Integer.parseInt(st.nextToken());

        int[] answer = new int[s1 + s2];
        int[] myAnswer = new int[s1 + s2];
        boolean sw = false;

        for (int i = 0; i < s1 + s2; i++) {
            st = new StringTokenizer(br.readLine());
            answer[i] = Integer.parseInt(st.nextToken());
            myAnswer[i] = Integer.parseInt(st.nextToken());

            if (i < s1 && answer[i] != myAnswer[i]) {
                System.out.println("Wrong Answer");
                sw = true;
                break;
            }

            else if (i >= s1 && answer[i]!= myAnswer[i]) {
                System.out.println("Why Wrong!!!");
                sw = true;
                break;
            }
        }

        if (!sw) {
            System.out.println("Accepted");
        }
    }
}
