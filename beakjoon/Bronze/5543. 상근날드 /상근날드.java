import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int sang = Integer.parseInt(br.readLine());
        int jung = Integer.parseInt(br.readLine());
        int ha = Integer.parseInt(br.readLine());
        int cola = Integer.parseInt(br.readLine());
        int cider = Integer.parseInt(br.readLine());

        int burger = Math.min( Math.min(sang, jung), ha );
        int drink = Math.min(cola, cider);

        System.out.println(burger + drink - 50);
    }
}
