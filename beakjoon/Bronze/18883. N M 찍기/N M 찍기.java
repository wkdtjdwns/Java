import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int index = 1;

        for (int i = 0; i < n; i++) {
            for (int j = 1; j < m; j++) {
                sb.append(index).append(" ");
                index++;
            }
            
            sb.append(index).append("\n");
            index++;
        }

        System.out.println(sb);
    }
}
