import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

    static Map<String, String> win = new HashMap<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        win.put("P", "R");
        win.put("R", "S");
        win.put("S", "P");

        String ms1 = st.nextToken();
        String ms2 = st.nextToken();
        String tk1 = st.nextToken();
        String tk2 = st.nextToken();

        String ms1Vstk1 = winPerson(ms1, tk1);
        String ms1Vstk2 = winPerson(ms1, tk2);
        String ms2Vstk1 = winPerson(ms2, tk1);

        if (ms1.equals(ms2) && tk1.equals(tk2) && ms1.equals(tk1)) {
            System.out.println("?");
            return;
        }

        if (ms1.equals(ms2)) {
            if (ms1Vstk1.equals("TK") || ms1Vstk2.equals("TK")) {
                System.out.println("TK");
            }

            else if(ms1Vstk1.equals("DRAW") || ms1Vstk2.equals("DRAW")){
                System.out.println("?");
            }

            else {
                System.out.println("MS");
            }

            return;
        }

        if (tk1.equals(tk2)) {
            if (ms1Vstk1.equals("MS") || ms2Vstk1.equals("MS")) {
                System.out.println("MS");
            }

            else if (ms1Vstk1.equals("DRAW") || ms2Vstk1.equals("DRAW")) {
                System.out.println("?");
            }

            else {
                System.out.println("TK");
            }

            return;
        }

        System.out.println("?");
    }

    static String winPerson(String ms, String tk) {
        String msWin = win.get(ms);
        String tkWin = win.get(tk);

        if (msWin.equals(tk)) {
            return "MS";
        }

        if (tkWin.equals(ms)) {
            return "TK";
        }

        return "DRAW";
    }
}
