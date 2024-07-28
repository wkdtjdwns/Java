import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int bx = Integer.parseInt(st.nextToken());
        int by = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int dx = Integer.parseInt(st.nextToken());
        int dy = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int jx = Integer.parseInt(st.nextToken());
        int jy = Integer.parseInt(st.nextToken());

        int bMove = Math.max((Math.abs(bx - jx)), (Math.abs(by - jy)));
        int dMove = Math.abs(dx - jx) + Math.abs(dy - jy);

        if (bMove < dMove) {
            System.out.println("bessie");
        }
        
        else if (bMove > dMove) {
            System.out.println("daisy");
        }
        
        else {
            System.out.println("tie");
        }
    }
}
