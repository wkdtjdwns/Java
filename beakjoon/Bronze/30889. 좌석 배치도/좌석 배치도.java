import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[][] seats = new char[10][20];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 20; j++) {
                seats[i][j] = '.';
            }
        }

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String seat = br.readLine();
            int x = seat.charAt(0) - 65;
            int y = seat.charAt(1) - 48;
            if (seat.length() == 3) {
                y *= 10;
                y += seat.charAt(2) - 48;
            }

            seats[x][y - 1] = 'o';
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print(seats[i][j]);
            }

            System.out.println();
        }
    }
}
