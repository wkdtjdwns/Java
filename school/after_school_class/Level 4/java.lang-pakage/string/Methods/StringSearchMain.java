package lang.string;

public class StringSearchMain {

    // 문자열 검색
    public static void main(String[] args) {

        String str = "Hello, Java! Welcome to Java World.";

        System.out.println("문자열에 'Java'가 포함되어 있는지: " + str.contains("Java")); // true
        System.out.println("처음부터 찾은 'Java'가 나오는 첫 번째 인덱스: " + str.indexOf("Java")); // 7
        System.out.println("인덱스 10부터 찾은 'Java'의 인덱스: " + str.indexOf("Java", 10)); // 24
        System.out.println("등장하는 모든 'Java'의 마지막 인덱스: " + str.lastIndexOf("Java")); // 24
    }
}
