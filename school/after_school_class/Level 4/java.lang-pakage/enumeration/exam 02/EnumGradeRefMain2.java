package enumeration.ref2;

public class EnumGradeRefMain2 {

    public static void main(String[] args) {
        
        int price = 10_000;
        
        DiscountService discountService = new DiscountService();
        int basic = discountService.discount(Grade.BASIC, price);

        System.out.println("basic = " + basic);
    }
}
