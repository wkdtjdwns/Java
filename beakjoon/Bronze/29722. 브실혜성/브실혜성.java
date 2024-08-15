import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), "-");
        int year = Integer.parseInt(st.nextToken());
        int month = Integer.parseInt(st.nextToken());
        int day = Integer.parseInt(st.nextToken());

        int n = Integer.parseInt(br.readLine());
        day += n;
        while (day > 30) {
            day -= 30;
            month += 1;
        }

        while (month > 12) {
            month -= 12;
            year += 1;
        }

        System.out.printf("%04d-%02d-%02d\n", year, month, day);
    }
}
