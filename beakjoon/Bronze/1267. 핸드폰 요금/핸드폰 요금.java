import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }

        int y = 0;
        int m = 0;

        for (int num : nums) {
            y += (num / 30 + 1) * 10;
            m += (num / 60 + 1) * 15;
        }

        if (m == y) {
            System.out.println("Y M " + m);
        }
        
        else if (m < y) {
            System.out.println("M " + m);
        }
        
        else {
            System.out.println("Y " + y);
        }
    }
}
