import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double max = 0;
        String snack = "";

        for (int i = 1; i <= 3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            double price = Double.parseDouble(st.nextToken());
            double weight = Double.parseDouble(st.nextToken());
            double money = 0;

            if (price * 10 >= 5000) {
                money = (weight * 10) / (price * 10 - 500);
            }

            else {
                money = (weight * 10) / (price * 10 );
            }

            if (max < money) {
                max = money;
                if (i == 1) {
                    snack = "S";
                }
                
                else if (i == 2) {
                    snack = "N";
                }
                
                else {
                    snack = "U";
                }
            }
        }

        System.out.print(snack);
    }
}
