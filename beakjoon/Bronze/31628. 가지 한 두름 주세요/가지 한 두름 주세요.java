import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[][] board = new String[10][10];

        for (int i = 0; i < 10; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 10; j++) {
                board[i][j] = st.nextToken();
            }
        }

        for (int i = 0; i < 10; i++) {
            int cnt = 1;
            for (int j = 1; j < 10; j++) {
                if (board[i][j].equals(board[i][j - 1])) {
                    cnt++;
                    if (cnt == 10) {
                        System.out.println(1);
                        return;
                    }
                }

                else {
                    cnt = 1;
                }
            }
        }

        for (int j = 0; j < 10; j++) {
            int cnt = 1;
            for (int i = 1; i < 10; i++) {
                if (board[i][j].equals(board[i - 1][j])) {
                    cnt++;
                    if (cnt == 10) {
                        System.out.println(1);
                        return;
                    }
                }

                else {
                    cnt = 1;
                }
            }
        }

        System.out.println(0);
    }
}
