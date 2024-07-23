import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] abc = {
                Integer.parseInt(st.nextToken()),
                Integer.parseInt(st.nextToken()),
                Integer.parseInt(st.nextToken())
        };

        Arrays.sort(abc);
        if (abc[0] + abc[1] > abc[2]) {
            System.out.println(abc[0] + abc[1] + abc[2]);
        }

        else {
            System.out.println((abc[0] + abc[1]) * 2 - 1);
        }
    }
}
