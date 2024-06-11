package poly.sort;

public class BubbleSort implements Sort {

    private String name = "BubbleSort";

    @Override
    public void ascending(int[] array) {
        System.out.println(name + " ascending");
    }

    @Override
    public void descending(int[] array) {
        System.out.println(name + " descending");
    }

    @Override
    public void description() {
        Sort.super.description(); // default 메서드 사용
        System.out.println(name + "입니다.");
    }
}
