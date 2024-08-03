import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String mbti = br.readLine();
        String result = "";
        for (int i = 0; i < mbti.length(); i++) {
            switch (mbti.charAt(i)) {
                case 'E': result += 'I'; break;
                case 'S': result += 'N'; break;
                case 'F': result += 'T'; break;
                case 'P': result += 'J'; break;
                case 'I': result += 'E'; break;
                case 'N': result += 'S'; break;
                case 'T': result += 'F'; break;
                case 'J': result += 'P'; break;
            }
        }

        System.out.println(result);
    }
}
