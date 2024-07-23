import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int aAttack = Integer.parseInt(st.nextToken());
        int aHp = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int bAttack = Integer.parseInt(st.nextToken());
        int bHp = Integer.parseInt(st.nextToken());
        
        while(true) {
            aHp -= bAttack;
            bHp -= aAttack;

            if (bHp <= 0 && aHp >= 1) {
                System.out.println("PLAYER A");
                break;
            }

            else if (aHp <= 0 && bHp >= 1) {
                System.out.println("PLAYER B");
                break;
            }

            else if (aHp >= 1 && bHp >= 1) {
                continue;
            }

            else {
                System.out.println("DRAW");
                break;
            }

        }
    }
}
