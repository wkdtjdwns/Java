import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        HashMap<Character, Integer> pieceScores = new HashMap<>();
        pieceScores.put('K', 0);
        pieceScores.put('k', 0);
        pieceScores.put('P', 1);
        pieceScores.put('p', 1);
        pieceScores.put('N', 3);
        pieceScores.put('n', 3);
        pieceScores.put('B', 3);
        pieceScores.put('b', 3);
        pieceScores.put('R', 5);
        pieceScores.put('r', 5);
        pieceScores.put('Q', 9);
        pieceScores.put('q', 9);

        int white = 0;
        int black = 0;

        // 체스판 입력 받기
        for (int i = 0; i < 8; i++) {
            String board = br.readLine();
            
            for (int j = 0; j < 8; j++) {
                char piece = board.charAt(j);
                
                if (pieceScores.containsKey(piece)) {
                    if (Character.isUpperCase(piece)) {
                        white += pieceScores.get(piece);
                    }
                    
                    else {
                        black += pieceScores.get(piece);
                    }
                }
            }
        }

        System.out.println(white - black);
    }
}
