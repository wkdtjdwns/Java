import java.io.*;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, String> seminar = new HashMap<>();

        seminar.put("Algorithm", "204");
        seminar.put("DataAnalysis", "207");
        seminar.put("ArtificialIntelligence", "302");
        seminar.put("CyberSecurity", "B101");
        seminar.put("Network", "303");
        seminar.put("Startup", "501");
        seminar.put("TestStrategy", "105");

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            System.out.println(seminar.get(br.readLine()));
        }
    }
}
