import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

class Position {
    double x, y;

    public Position(double x, double y) {
        this.x = x;
        this.y = y;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; ++i) {
            List<Position> v = new ArrayList<>();
            List<Position> player1 = new ArrayList<>();
            List<Position> player2 = new ArrayList<>();

            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 6; ++j) {
                double x = Double.parseDouble(st.nextToken());
                double y = Double.parseDouble(st.nextToken());
                v.add(new Position(x, y));
            }

            player1.addAll(v.subList(0, 3));
            player2.addAll(v.subList(3, 6));
            int player1Score = getScore(player1);
            int player2Score = getScore(player2);
            System.out.print("SCORE: " + player1Score + " to " + player2Score + ", ");
            if (player1Score == player2Score) {
                System.out.println("TIE.");
            }

            else if (player1Score > player2Score) {
                System.out.println("PLAYER 1 WINS.");
            }

            else {
                System.out.println("PLAYER 2 WINS.");
            }
        }
    }

    static int getScore(List<Position> player) {
        int sum = 0;
        for (int i = 0; i < 3; ++i) {
            double len = Math.sqrt(player.get(i).x * player.get(i).x + player.get(i).y * player.get(i).y);
            if (len <= 3) {
                sum += 100;
            }

            else if (len <= 6) {
                sum += 80;
            }

            else if (len <= 9) {
                sum += 60;
            }

            else if (len <= 12) {
                sum += 40;
            }

            else if (len <= 15) {
                sum += 20;
            }
        }

        return sum;
    }
}
