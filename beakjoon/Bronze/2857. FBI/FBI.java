import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> fbi = new ArrayList<>();
        for (int i = 1; i < 6; i++) {
            String name = br.readLine();
            if (name.contains("FBI")) {
                fbi.add(i);
            }
        }

        if (fbi.isEmpty()) {
            System.out.println("HE GOT AWAY!");
        }

        else {
            for (int i : fbi) {
                System.out.print(i + " ");
            }

        }
    }
}
