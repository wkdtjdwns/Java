import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            String str = br.readLine();
            char[][] arr = new char[n][str.length()];
            boolean[] checks = new boolean[n];

            for (int j = 0; j < n; j++) {
                for (int k = 0; k < str.length(); k++) {
                    arr[j][k] = str.charAt(k);
                }

                if (j == n - 1) {
                    break;
                }

                str = br.readLine();
            }

            HashSet<Character> set = new HashSet<>();
            int cnt = 0;
            for (int j = 0; j < str.length(); j++) {
                for (int k = 0; k < n; k++) {
                    if (checks[k]) {
                        continue;
                    }

                    cnt += 1;
                    set.add(arr[k][j]);
                }

                if (cnt == 1) {
                    break;
                }

                if (set.size() == 2) {
                    char a = '0';
                    char b = '0';
                    char result = 0;
                    for (char c : set) {
                        if (a != '0' && b == '0') {
                            b = c;
                        }

                        if (a == '0') {
                            a = c;
                        }
                    }

                    if ((a == 'R' && b == 'S') || (a == 'S' && b == 'S')) {
                        result = 'S';
                    }

                    else if ((a == 'S' && b == 'P') || (a == 'P' && b == 'S')) {
                        result = 'P';
                    }

                    else if ((a == 'R' && b == 'P') || (a == 'P' && b == 'R')) {
                        result = 'R';
                    }

                    for (int k = 0; k < n; k++) {
                        if (!checks[k] && arr[k][j] == result) {
                            checks[k] = true;
                        }
                    }
                }

                set.clear();
            }

            if (cnt != 1) {
                cnt = 0;
                for (int j = 0; j < n; j++) {
                    if (!checks[j]) {
                        cnt += 1;
                    }
                }
            }

            if (cnt == 1) {
                for (int j = 0; j < n; j++) {
                    if (!checks[j]) {
                        System.out.println(j + 1);
                        break;
                    }
                }
            }

            else {
                System.out.println(0);
            }
        }
    }
}
