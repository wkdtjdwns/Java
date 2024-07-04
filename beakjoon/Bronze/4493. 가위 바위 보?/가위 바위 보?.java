import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            int cnt = 0;

            for (int j = 0; j < n; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                String s = st.nextToken();
                String s2 = st.nextToken();

                if (s.equals("R") && s2.equals("P")) {
                    cnt++;
                }
                
                else if (s.equals("R") && s2.equals("S")) {
                    cnt--;
                }
                
                else if (s.equals("P") && s2.equals("R")) {
                    cnt--;
                }
                
                else if (s.equals("P") && s2.equals("S")) {
                    cnt++;
                }
                
                else if (s.equals("S") && s2.equals("R")) {
                    cnt++;
                }
                
                else if (s.equals("S") && s2.equals("P")) {
                    cnt--;
                }
            }

            if (cnt < 0) {
                System.out.println("Player 1");
            }
            
            else if (cnt > 0) {
                System.out.println("Player 2");
            }
            
            else {
                System.out.println("TIE");
            }
        }
    }
}
