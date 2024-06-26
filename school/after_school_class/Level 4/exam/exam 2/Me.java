package solveExam.exam2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Me {

    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        boolean[] check = new boolean[1000];
        for (int i = 123; i < 1000; i++) {
            String str = Integer.toString(i);

            if (str.charAt(0) == '0' || str.charAt(1) == '0' || str.charAt(2) == '0') {
                continue;
            }

            if (str.charAt(0) == str.charAt(1) ||
                    str.charAt(0) == str.charAt(2) ||
                    str.charAt(1) == str.charAt(2)) {
                continue;
            }

            check[i] = true;
        }

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int request = Integer.parseInt(st.nextToken());
            int strike = Integer.parseInt(st.nextToken());
            int ball = Integer.parseInt(st.nextToken());

            for (int result = 123; result < 1000; result++) {
                if (check[result]) {
                    int nStrike = 0;
                    int nBall = 0;

                    for (int first = 0; first < 3; first++) {
                        char requestSplit = Integer.toString(request).charAt(first);

                        for (int second = 0; second < 3; second++) {
                            char resultSplit = Integer.toString(result).charAt(second);

                            if (requestSplit == resultSplit && first == second) {
                                nStrike++;
                            }

                            else if (requestSplit == resultSplit) {
                                nBall++;
                            }
                        }
                    }
                    
                    if (nStrike == strike && nBall == ball) {
                        check[result] = true;
                    }

                    else {
                        check[result] = false;
                    }
                }
            }
        }

        int result = 0;
        for (int i = 123; i < 1000; i++) {
            if (check[i]) result++;
        }

        System.out.println(result);
    }
}
