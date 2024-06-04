import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int angleA = Integer.parseInt(br.readLine());
        int angleB = Integer.parseInt(br.readLine());
        int angleC = Integer.parseInt(br.readLine());

        if ((angleA + angleB + angleC) == 180) {

            if (angleA == 60 && angleB == 60 && angleC == 60) {
                System.out.println("Equilateral");
            }

            else if ((angleA == angleB) || (angleB == angleC) || (angleA == angleC)) {
                System.out.println("Isosceles");
            }

            else {
                System.out.println("Scalene");
            }
        }

        else {
            System.out.println("Error");
        }
    }
}
