import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            System.out.println(fas1(Integer.parseInt(st.nextToken())) + fas2(Integer.parseInt(st.nextToken())));
        }
    }

    static int fas1(int rank) {
        if (rank == 1) return 5000000;
        else if (2 <= rank && rank <= 3) return 3000000;
        else if (4 <= rank && rank <= 6) return 2000000;
        else if (7 <= rank && rank <= 10) return 500000;
        else if (11 <= rank && rank <= 15) return 300000;
        else if (16 <= rank && rank <= 21) return 100000;
        else return 0;
    }

    static int fas2(int rank) {
        if (rank == 1) return 5120000;
        else if (2 <= rank && rank <= 3) return 2560000;
        else if (4 <= rank && rank <= 7) return 1280000;
        else if (8 <= rank && rank <= 15) return 640000;
        else if (16 <= rank && rank <= 31) return 320000;
        else return 0;
    }
}
