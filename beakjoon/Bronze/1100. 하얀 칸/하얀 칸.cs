import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = 0;
        for (int i = 0; i < 8; i++) {
            String board = br.readLine();
            if (i % 2 == 0) {
                for (int j = 0; j < 8; j++) {
                    if (j % 2 == 0) {
                        if (board.charAt(j) == 'F') {
                            cnt++;
                        }
                    }
                }
            }

            else {
                for (int j = 0; j < 8; j++) {
                    if (j % 2 == 1) {
                        if (board.charAt(j) == 'F') {
                            cnt++;
                        }
                    }
                }
            }
        }

        System.out.println(cnt);
    }
}
