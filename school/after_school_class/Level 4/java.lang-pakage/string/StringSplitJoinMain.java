package lang.string;

public class StringSplitJoinMain {

    public static void main(String[] args) {

        String str = "Apple,Banana,Orange";

        // Split()
        String[] splitStr = str.split(",");

        for (String s : splitStr) {
            System.out.println(s);
        }

        // join()
        String joindStr = String.join("-", "S", "B", "C");
        System.out.println("연결된 문자열: " + joindStr);

        // 문자열 배열 연결
        String result = String.join("-", splitStr);
        System.out.println("result: " + result);
    }
}
