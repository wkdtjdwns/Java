package generics;

public class GenericsMain1 {

    public static void main(String[] args) {
        Integer[] iArray = { 1, 2, 3, 4, 5 };
        Double[] dArray = { 1.0, 2.0, 3.0, 4.0, 5.0 };
        String[] sArray = { "A", "B", "C", "D", "E" };

        // Generics는 Wrapper 클래스만, 즉 기본 자료형은 사용할 수 없음.
        printAnyArray(iArray);
        printAnyArray(dArray);
        printAnyArray(sArray);
    }

    // 제네릭 메서드 생성
    // <T>: Type
    // <E>: Element
    // <K>: Key
    // <V>: Value

    // T는 String, Integer와 같은 하나의 "타입"으로 보면 편함.
    private static <T> void printAnyArray(T[] array) {
        for (T t : array) {
            System.out.print(t + " ");
        }

        System.out.println();
    }
}
