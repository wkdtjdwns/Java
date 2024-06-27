package solveExam.exam4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Me {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        HashSet<String> listen = new HashSet<>();
        for (int i = 0; i < n; i++) {
            listen.add(br.readLine());
        }

        int cnt = 0;
        ArrayList<String> ls = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            String name = br.readLine();

            if (listen.contains(name)) {
                cnt++;
                ls.add(name);
            }
        }

        System.out.println(cnt);
        Collections.sort(ls);
        for (String name : ls) {
            System.out.println(name);
        }
    }
}
