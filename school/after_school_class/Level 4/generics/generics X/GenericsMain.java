package generics;

public class GenericsMain {

    public static void main(String[] args) {
        int[] iArray = { 1, 2, 3, 4, 5 };
        double[] dArray = { 1.0, 2.0, 3.0, 4.0, 5.0 };
        String[] sArray = { "A", "B", "C", "D", "E" };

        // 실행하는 로직은 결국 똑같은 데 타입이 다르기 때문에
        // 똑같은 기능을 하는 메서드를 무려 3개나 만들어야 함.
        printIntArray(iArray);
        printDoubleArray(dArray);
        printStringArray(sArray);
    }

    private static void printIntArray(int[] iArray) {
        for (int i : iArray) {
            System.out.print(i + " ");
        }

        System.out.println();
    }

    private static void printDoubleArray(double[] dArray) {
        for (double d : dArray) {
            System.out.print(d + " ");
        }

        System.out.println();
    }

    private static void printStringArray(String[] sArray) {
        for (String s : sArray) {
            System.out.print(s + " ");
        }

        System.out.println();
    }
}
