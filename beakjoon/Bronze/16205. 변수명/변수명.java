import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int type = Integer.parseInt(st.nextToken());
        String str = st.nextToken();

        String camel = "";
        String snake = "";
        String pascal = "";

        switch (type) {
            case 1:
                camel = str;
                snake = camelToSnake(str);
                pascal = camelToPascal(str);
                break;

            case 2:
                camel = snakeToCamel(str);
                snake = str;
                pascal = camelToPascal(camel);
                break;

            case 3:
                camel = pascalToCamel(str);
                snake = camelToSnake(camel);
                pascal = str;
                break;
        }

        System.out.println(camel);
        System.out.println(snake);
        System.out.println(pascal);
    }

    static String camelToSnake(String str) {
        StringBuilder result = new StringBuilder();
        for (char ch : str.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                result.append('_').append(Character.toLowerCase(ch));
            }

            else {
                result.append(ch);
            }
        }

        return result.toString();
    }

    static String camelToPascal(String str) {
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }

    static String snakeToCamel(String str) {
        StringBuilder result = new StringBuilder();
        boolean toUpperCase = false;
        for (char ch : str.toCharArray()) {
            if (ch == '_') {
                toUpperCase = true;
            }

            else {
                if (toUpperCase) {
                    result.append(Character.toUpperCase(ch));
                    toUpperCase = false;
                }

                else {
                    result.append(ch);
                }
            }
        }

        return result.toString();
    }

    static String pascalToCamel(String str) {
        return str.substring(0, 1).toLowerCase() + str.substring(1);
    }
}
