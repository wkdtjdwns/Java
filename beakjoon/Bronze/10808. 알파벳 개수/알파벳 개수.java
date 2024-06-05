import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        int[] array = new int[26];

        for (int i = 0; i < str.length(); i++) {
            array[str.charAt(i) - 97]++;
        }

        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
