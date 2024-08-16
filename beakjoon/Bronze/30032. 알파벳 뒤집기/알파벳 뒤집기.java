import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        for (int i = 0; i < n; i++) {
            String a = br.readLine();
            if (d == 1) {
                for (int j = 0; j < n; j++) {
                    if (a.charAt(j) == 'd') {
                        System.out.print("q");
                    }

                    else if (a.charAt(j) == 'b') {
                        System.out.print("p");
                    }

                    else if(a.charAt(j) == 'q') {
                        System.out.print("d");
                    }

                    else {
                        System.out.print("b");
                    }
                }

                System.out.println();
            }

            else if (d == 2) {
                for (int j = 0; j < n; j++) {
                    if (a.charAt(j) == 'd') {
                        System.out.print("b");
                    }

                    else if (a.charAt(j) == 'b') {
                        System.out.print("d");
                    }

                    else if (a.charAt(j) == 'q') {
                        System.out.print("p");
                    }

                    else {
                        System.out.print("q");
                    }
                }

                System.out.println();
            }
        }
    }
}
