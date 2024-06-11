package poly.sort;

public interface Sort {
    void ascending(int[] array);
    void descending(int[] array);

    // default 메서드: 재정의할 필요 없이 그냥 가져다 쓸 수 있음.
    // 대신 바디를 구현해주어야 하고, 사용할 지 안 사용할 지 정해줘야 함.
    default void description() {
        System.out.println("숫자를 정렬하는 알고리즘입니다.");
    }
}
