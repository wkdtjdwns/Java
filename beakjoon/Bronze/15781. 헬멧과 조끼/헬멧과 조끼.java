import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        int h[] = new int[n];
        int a[] = new int[m];
        int cnt1 = 0;
        int cnt2 = 0;

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            h[i] = Integer.parseInt(st.nextToken());
            if (cnt1 < h[i]) {
                cnt1 = h[i];
            }
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            
            a[i] = Integer.parseInt(st.nextToken());
            if (cnt2 < a[i]) {
                cnt2 = a[i];
            }
        }
        
        System.out.println(cnt1 + cnt2);
    }
}
