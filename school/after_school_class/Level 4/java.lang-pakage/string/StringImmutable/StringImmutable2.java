package lang.string;

public class StringImmutable2 {

    public static void main(String[] args) {

        String str1 = "hello";
        String str2 = str1.concat(" java");

        System.out.println("Str1 = " + str1);
        System.out.println("Str2 = " + str2);
    }
}
