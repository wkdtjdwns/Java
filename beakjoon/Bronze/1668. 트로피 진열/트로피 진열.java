import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int left = 1; int leftMax;
        int right = 1; int rightMax;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(br.readLine());
        }
        
        leftMax = a[0];
        rightMax = a[n - 1];

        for (int i = 1; i < n; i++) {
            if (leftMax < a[i]) {
                leftMax = a[i];
                left++;
            }
        }

        for (int i = n - 2; i >= 0 ; i--) {
            if (rightMax < a[i]) {
                rightMax = a[i];
                right++;
            }
        }

        System.out.println(left);
        System.out.println(right);
    }
}
