import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int vacation = Integer.parseInt(br.readLine());
        int korean = Integer.parseInt(br.readLine());
        int math = Integer.parseInt(br.readLine());
        int maxKorean = Integer.parseInt(br.readLine());
        int maxMath = Integer.parseInt(br.readLine());

        int k = (korean % maxKorean == 0) ? (korean / maxKorean) : (korean / maxKorean) + 1;
        int m = (math % maxMath == 0) ? (math / maxMath) : (math / maxMath) + 1;

        int free = (k > m) ? vacation - k : vacation - m;
        System.out.println(free);
    }
}
