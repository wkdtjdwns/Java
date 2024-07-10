import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++){
            String str = br.readLine();

            System.out.println("String #" + (i + 1));
            for (int j = 0; j < str.length(); j++){
                char c = str.charAt(j);
                c += 1;

                if (c == 91){
                    c = 65;
                }

                System.out.print(c);
            }

            System.out.println("\n");
        }
    }
}
