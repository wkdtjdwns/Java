import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] alphabet = new int[26];
        int n = Integer.parseInt(br.readLine());
        String str = br.readLine().replaceAll(" ", "").replaceAll(",", "").replaceAll("\\.", "");
        for (char c : str.toCharArray()) {
            alphabet[c - 'a']++;
        }

        int max = 0;
        for (int i : alphabet) {
            if (max < i) {
                max = i;
            }
        }

        System.out.println(max);
    }
}
