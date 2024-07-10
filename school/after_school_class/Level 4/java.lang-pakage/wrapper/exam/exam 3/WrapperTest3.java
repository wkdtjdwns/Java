package lang.wrapper.test;

public class WrapperTest3 {

    public static void main(String[] args) {

        String str = "100";

        // String str을 Integer로 변환해서 출력: 박싱
        // Integer를 int로 변환해서 출력: 오토 언박싱
        // int를 Integer로 변환해서 출력: 오토 박싱

        // String -> Integer
        Integer integerValue1 = Integer.valueOf(str);
        System.out.println(integerValue1);

        // Integer -> int
        int intValue = integerValue1;
        System.out.println(integerValue1);
        
        // int -> Integer
        Integer integerValue2 = intValue;
        System.out.println(integerValue2);
    }
}
