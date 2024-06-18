package lang.string;

public class StringComparisonMain {

    // 문자열 비교
    public static void main(String[] args) {

        String str1 = "Hello, Java!";
        String str2 = "hello, java!";
        String str3 = "Hello, World!";

        // 기본적인 문자열 비교
        System.out.println("str1 equals str2: " + str1.equals(str2)); // false

        // 대소문자 구분 없이 비교
        System.out.println("str1 equalsIgnoreCase str2: " + str1.equalsIgnoreCase(str2)); // true

        // 사전 수 비교 (아스키 코드라고 이해하면 쉬움)
        System.out.println("'b' compareTo 'a': " + "b".compareTo("a")); // 1
        System.out.println("str1 compareToIgnoreCase str2: " + str1.compareToIgnoreCase(str2)); // 0

        // 시작과 끝 비교
        System.out.println("str1 startsWith 'Hello': " + str1.startsWith("Hello")); // true
        System.out.println("str1 endsWith 'Java!': " + str1.endsWith("Java!")); // fa
    }
}
