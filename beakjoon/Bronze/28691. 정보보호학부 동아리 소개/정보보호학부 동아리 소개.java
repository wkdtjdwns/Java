import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String club = br.readLine();

        switch (club) {
            case "M": {
                System.out.println("MatKor");
                break;
            }

            case "W": {
                System.out.println("WiCys");
                break;
            }

            case "C": {
                System.out.println("CyKor");
                break;
            }

            case "A": {
                System.out.println("AlKor");
                break;
            }

            default: {
                System.out.println("$clear");
                break;
            }
        }
    }
}
