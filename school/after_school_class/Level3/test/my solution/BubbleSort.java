package poly.sort;

public class BubbleSort implements Sort {

    private String name;

    @Override
    public void ascending(int[] array) {
        System.out.println("BubbleSort ascending");
    }

    @Override
    public void descending(int[] array) {
        System.out.println("BubbleSort descending");
    }

    @Override
    public void description() {
        System.out.println("숫자를 정렬하는 알고리즘입니다.");
        System.out.println("BubbleSort입니다.");
    }
}
