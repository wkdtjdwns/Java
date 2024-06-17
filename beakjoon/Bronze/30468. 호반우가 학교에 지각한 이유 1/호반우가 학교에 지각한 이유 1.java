import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int Str = Integer.parseInt(st.nextToken());
        int Dex = Integer.parseInt(st.nextToken());
        int Int = Integer.parseInt(st.nextToken());
        int Luk = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        
        int totalStatus = Str + Dex + Int + Luk;

        if (totalStatus < (4 * n)) {
            System.out.println((4 * n) - totalStatus);
        }
        
        else {
            System.out.println(0);
        }
    }
}
