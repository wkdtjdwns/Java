package classExam;

// 마켓에 있는 제품들
public class MarketGoods {
    /*
        복습 문제

        - 인스턴스 변수 (필드) - 접근제한자는 전부 private로 설정함
            1. String name -> 상품 이름
            2. in retailPrice -> 상품의 출시 가격
            3. int discountRate -> 상품의 할인율

        - 생성자 (값을 지정해주도록 함)
            1. 세 개의 파라미터를 받는 생성자
            2. name, retailPrice 2개의 파라미터를 받는 생성자

        - Getter / Setter 메소드
            1. name, retailPrice는 getter 메소드만, discountRate는 getter와 setter 모두 작성함

        - getDiscountRate() 메소드
            - 할인가를 리턴하는 메소드임
            - 예) retailPrice = 10000, discountRate = 20일 때 8000을 리턴함
     */

    // 인스턴스 변수 (필드)
    private String name;
    private int retailPrice;

    private int discountRate;


    // 생성자
    public MarketGoods(String newName, int newRetailPrice, int newDiscountRate)
    {
        this.name = newName;
        this.retailPrice = newRetailPrice;
        this.discountRate = newRetailPrice;
    }

    public MarketGoods(String newName, int newRetailPrice)
    {
        this.name = newName;
        this.retailPrice = newRetailPrice;
    }


    // getter / setter
    public String getName()
    {
        return name;
    }

    public int getRetailPrice()
    {
        return retailPrice;
    }

    public void setDiscountRate(int newDiscountRate)
    {
        if (discountRate < 0)
        {
            System.out.println("제대로 된 값을 입력하시오.");
            return;
        }

        this.discountRate = newDiscountRate;
    }

    public int getDiscountRate()
    {
        return retailPrice * (100 - discountRate) / 100;
    }

}
