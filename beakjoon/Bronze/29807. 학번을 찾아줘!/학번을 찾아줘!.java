import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());
        int[] scores = new int[t];

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < scores.length; i++) {
            scores[i] = Integer.parseInt(st.nextToken());
        }

        int num = 0;
        if (t == 1) {
            num += scores[0] * 508;
        }
        
        else if (t == 2) {
            num += scores[0] * 508;
            num += scores[1] * 212;
        }
        
        else if (t == 3) {
            if (scores[0] > scores[2]) {
                num += (scores[0] - scores[2]) * 508;
            }
            
            else {
                num += (scores[2] - scores[0]) * 108;
            }

            num += scores[1] * 212;
        } 
        
        else if (t == 4) {
            if (scores[0] > scores[2]) {
                num += (scores[0] - scores[2]) * 508;
            }
            
            else {
                num += (scores[2] - scores[0]) * 108;
            }

            if (scores[1] > scores[3]) {
                num += (scores[1] - scores[3]) * 212;
            }
            
            else {
                num += (scores[3] - scores[1]) * 305;
            }
        }
        
        else if (t == 5) {
            if (scores[0] > scores[2]) {
                num += (scores[0] - scores[2]) * 508;
            }
            
            else {
                num += (scores[2] - scores[0]) * 108;
            }

            if (scores[1] > scores[3]) {
                num += (scores[1] - scores[3]) * 212;
            }
            
            else {
                num += (scores[3] - scores[1]) * 305;
            }

            num += scores[4] * 707;
        }

        num *= 4763;
        System.out.println(num);
    }
}
