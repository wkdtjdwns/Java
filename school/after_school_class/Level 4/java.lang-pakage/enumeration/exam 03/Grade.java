package enumeration.ref3;

public enum Grade {
    BASIC(10), GOLD(20), DIAMOND(30);

    private final int discountPercent;

    Grade(int discountPercent) {
        this.discountPercent = discountPercent;
    }

    public int getDiscountPercent(int price) {
        return discountPercent;
    }

    // 추가 - 캡슐화 및 불필요한 클래스 삭제를 위함
    public int discount(int price) {
        return price * discountPercent / 100;
    }
}
