package classExam;

// 마켓에 있는 제품들
public class MarketGoods {
    // 복습 문제
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
