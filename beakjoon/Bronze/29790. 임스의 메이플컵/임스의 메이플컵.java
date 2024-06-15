import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int u = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());

        boolean isBaekjoon = false;
        boolean isMaple = false;
        if (n >= 1000) {
            isBaekjoon = true;
        }

        if (u >= 8000 || l >= 260) {
            isMaple = true;
        }

        if (isBaekjoon && isMaple) {
            System.out.println("Very Good");
        }
        
        else if (isBaekjoon) {
            System.out.println("Good");
        }
        
        else {
            System.out.println("Bad");
        }
    }
}
