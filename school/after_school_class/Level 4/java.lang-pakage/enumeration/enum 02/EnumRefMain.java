package enumeration.ex3;

public class EnumRefMain {

    public static void main(String[] args) {
        System.out.println("class BASIC = " + Grade.BASIC.getClass());
        System.out.println("class GOLD = " + Grade.GOLD.getClass());
        System.out.println("class DIAMOND = " + Grade.DIAMOND.getClass());

        /*class BASIC = class enumeration.ex3.Grade
        class GOLD = class enumeration.ex3.Grade
        class DIAMOND = class enumeration.ex3.Grade*/

        System.out.println("ref BASIC = " + refValue(Grade.BASIC));
        System.out.println("ref GOLD = " + refValue(Grade.GOLD));
        System.out.println("ref DIAMOND = " + refValue(Grade.DIAMOND));

        /*ref BASIC = 4e50df2e
        ref GOLD = 1d81eb93
        ref DIAMOND = 7291c18f*/
    }

    // 다형성 활용
    private static String refValue(Object grade) {
        // System.identityHashCode(): 자바가 관리하는 객체의 참조값을 주소로 줌.
        // Integer.toHexString(): 숫자를 16진수로 바꿔줌. (일반적으로 확인하는 참조값: 16진수)
        return Integer.toHexString(System.identityHashCode(grade));
    }
}
