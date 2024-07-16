package enumeration.ref1;

public class ClassGrade {

    // 어짜피 등급만 알면 얼마나 할인할 지 알기 때문에 선언하면서 값을 넣어줌.
    public static final ClassGrade BASIC = new ClassGrade(10);
    public static final ClassGrade GOLD = new ClassGrade(20);
    public static final ClassGrade DIAMOND = new ClassGrade(30);

    // 초기화 시키면 굳이 안 바꿀 값이기 떄문에 final로 둠.
    private final int discountPercent;

    // 열거형 사용 -> 생성자: private
    private ClassGrade(int discountPercent) {
        this.discountPercent = discountPercent;
    }

    public int getDiscountPercent() {
        return discountPercent;
    }
}

// 상수를 정의할 때 각각의 등급에 따른 할인율이 정해짐.
