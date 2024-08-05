import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        
        String[] array = new String[m];
        for (int i = 0; i < m; i++) {
            StringBuilder sb = new StringBuilder();
            st = new StringTokenizer(br.readLine());
            int[] temp = new int[n];
            for (int j = 0; j < n; j++) {
                temp[j] = Integer.parseInt(st.nextToken());
            }
            
            for (int j = 0; j < n-1; j++) {
                for (int k = j+1; k < n; k++) {
                    if (temp[k]> temp[j]) {
                        sb.append('+');
                    }
                    
                    else if (temp[k]< temp[j]) {
                        sb.append('-');
                    }
                    
                    else {
                        sb.append('=');
                    }
                }
            }
            
            array[i] = sb.toString();
        }

        int cnt = 0;
        for (int i = 0; i < m-1; i++) {
            for (int j = i+1; j < m; j++) {
                if (array[i].equals(array[j])) cnt++;
            }
        }
        
        System.out.println(cnt);
    }
}
