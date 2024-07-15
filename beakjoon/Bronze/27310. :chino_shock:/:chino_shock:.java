import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String emoji = br.readLine();
        int emojiLength = emoji.length();
        int colon = emoji.length() - emoji.replace(String.valueOf(':'), "").length();
        int underBar = emoji.length() - emoji.replace(String.valueOf('_'), "").length();

        System.out.println(emojiLength + colon + underBar * 5);
    }
}
