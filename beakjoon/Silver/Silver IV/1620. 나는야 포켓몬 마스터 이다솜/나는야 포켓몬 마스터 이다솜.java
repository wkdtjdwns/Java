import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        HashMap<String, Integer> pokemons = new HashMap<>();
        List<String> keys = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            String name = br.readLine();
            pokemons.put(name, i);
            keys.add(name);
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m; i++) {
            String str = br.readLine();
            if (Character.isDigit(str.charAt(0))) {
                int index = Integer.parseInt(str) - 1;
                sb.append(keys.get(index)).append("\n");
            }

            else {
                sb.append(pokemons.get(str)).append("\n");
            }
        }

        System.out.print(sb.toString());
    }
}
