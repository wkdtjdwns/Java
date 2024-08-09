import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            double cm = Integer.parseInt(st.nextToken());
            double kg = Integer.parseInt(st.nextToken());
            double bmi = kg / (cm * cm / 10000);
            if (cm < 140.1) {
                System.out.println(6);
            }
            
            else if (cm < 146) {
                System.out.println(5);
            }

            else if (cm < 159) {
                System.out.println(4);
            }

            else if (cm < 161) {
                if (bmi >= 16.0 && bmi < 35.0) {
                    System.out.println(3);
                }
                
                else {
                    System.out.println(4);
                }
            }

            else if (cm < 204) {
                if (bmi >= 20.0 && bmi < 25.0) {
                    System.out.println(1);
                }
                
                else if (bmi >= 18.5 && bmi < 20.0) {
                    System.out.println(2);
                }

                else if (bmi >= 25.0 && bmi < 30.0) {
                    System.out.println(2);
                }

                else if (bmi >= 16.0 && bmi < 18.5) {
                    System.out.println(3);
                }

                else if (bmi >= 30.0 && bmi < 35.0) {
                    System.out.println(3);
                }

                else {
                    System.out.println(4);
                }
            }

            else {
                System.out.println(4);
            }
        }
    }
}
