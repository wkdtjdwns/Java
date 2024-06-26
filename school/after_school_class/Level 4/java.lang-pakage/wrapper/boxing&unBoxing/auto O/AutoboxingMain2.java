package lang.wrapper;

public class AutoboxingMain2 {

    public static void main(String[] args) {

        // Primitive -> Wrapper
        int value = 7;
        Integer boxedValue = value; // 자동 박싱

        // Wrapper -> Primitive
        int unboxedValue = boxedValue; // 자동 언박싱

        System.out.println("boxedValue = " + boxedValue);
        System.out.println("unboxedValue = " + unboxedValue);
    }
}
