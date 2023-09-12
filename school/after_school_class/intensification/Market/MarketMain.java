package classExam;

// 테스트 하는 클래스
public class MarketMain {

    public static void main(String[] args) {
        // 복습 문제 테스트
        
        // 인스턴스화 및 값 할당
        MarketGoods item1 = new MarketGoods("김규민", 10000, 20);
        MarketGoods item2 = new MarketGoods("돼지", 25000);
        item1.setDiscountRate(20);

        // 테스트
        System.out.println("이름 = " + item1.getName() + " 출시가격 = " + item1.getRetailPrice() + " 할인가 = " + item1.getDiscountRate());
        System.out.println("이름 = " + item2.getName() + " 출시가격 = " + item2.getRetailPrice());
    }
}
