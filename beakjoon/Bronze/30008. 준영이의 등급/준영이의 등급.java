import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] grades = new int[k];
        int[] p = new int[k];
        
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < k; i++) {
            grades[i] = Integer.parseInt(st.nextToken());
            p[i] = grades[i] * 100 / n;

            if (p[i] <= 4) { sb.append(1).append(" "); }
            else if (p[i] <= 11){ sb.append(2).append(" "); }
            else if (p[i] <= 23) { sb.append(3).append(" "); }
            else if (p[i] <= 40) { sb.append(4).append(" "); }
            else if (p[i] <= 60) { sb.append(5).append(" "); }
            else if (p[i] <= 77) { sb.append(6).append(" "); }
            else if (p[i] <= 89) { sb.append(7).append(" "); }
            else if(p[i] <= 96) { sb.append(8).append(" "); }
            else { sb.append(9).append(" "); }
        }

        System.out.println(sb.toString());
    }
}
