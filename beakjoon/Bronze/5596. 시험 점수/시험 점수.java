import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int info1 = Integer.parseInt(st.nextToken());
        int math1 = Integer.parseInt(st.nextToken());
        int science1 = Integer.parseInt(st.nextToken());
        int english1 = Integer.parseInt(st.nextToken());
        int total1 = info1 + math1 + science1 + english1;

        st = new StringTokenizer(br.readLine());
        int info2 = Integer.parseInt(st.nextToken());
        int math2 = Integer.parseInt(st.nextToken());
        int science2 = Integer.parseInt(st.nextToken());
        int english2 = Integer.parseInt(st.nextToken());
        int total2 = info2 + math2 + science2 + english2;

        System.out.println(Math.max(total1, total2));
    }
}
