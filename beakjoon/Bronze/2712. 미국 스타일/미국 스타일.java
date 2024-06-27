import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            double value = Double.parseDouble(st.nextToken());
            String unit = st.nextToken();

            double resultValue = 0;
            String reusltUnit = "";
            String result = "";

            if (unit.equals("kg")) {
                reusltUnit = "lb";
                resultValue = value * 2.2046;
                result = String.format("%.4f", resultValue);
            }
            
            else if (unit.equals("l")) {
                reusltUnit = "g";
                resultValue = value * 0.2642;
                result = String.format("%.4f", resultValue);
            }
            
            else if (unit.equals("lb")) {
                reusltUnit = "kg";
                resultValue = value * 0.4536;
                result = String.format("%.4f", resultValue);
            }
            
            else if (unit.equals("g")) {
                reusltUnit = "l";
                resultValue = value * 3.7854;
                result = String.format("%.4f", resultValue);
            }

            sb.append(result).append(" ").append(reusltUnit).append("\n");
        }

        System.out.println(sb.toString());
    }
}
