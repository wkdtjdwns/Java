package classExam;

// 마켓에 있는 제품들
public class MarketGoods {
    // 인스턴스 변수 (필드)

    // 상수를 사용하는 경우
    // - 절대 바뀌면 안 되는 값일 때 ex) pi(3.14...), 게임 캐릭터의 기본 능력치 등등
    // - 바뀌지 않는 값이면서 접근은 자주 해야하는 값일 때
    
    /* 이름과 출시 가격은 바꾸지 않을 것이기 때문에 final, 즉 상수로 두어서 그 누구도 바꾸지 못하게 함
    상수로 두게 된다면 누군가가 접근을 하더라도 바꾸지 못하기 때문에 접근 제한자를 public으로 바꾸어도 됨
    접근 제한자가 public이라면 getter를 굳이 사용할 필요가 없음 */
    public final String name;
    public final int retailPrice;
    private int discountRate;

    // 생성자
    public MarketGoods(String newName, int newRetailPrice, int newDiscountRate)
    {
        this.name = newName;

        if (newRetailPrice < 0)
        {
            this.retailPrice = 0;
        }

        else
        {
            this.retailPrice = newRetailPrice;
        }

        if (newDiscountRate < 0 || newDiscountRate > 100)
        {
            this.discountRate = 0;
        }

        else
        {
            this.discountRate = newDiscountRate;
        }
    }

    public MarketGoods(String newName, int newRetailPrice)
    {
        this.name = newName;

        if (newRetailPrice < 0)
        {
            this.retailPrice = 0;
        }

        else
        {
            this.retailPrice = newRetailPrice;
        }
    }

    // getter / setter
//    public String getName()
//    {
//        return name;
//    }
//
//    public int getRetailPrice()
//    {
//        return retailPrice;
//    }

    public void setDiscountRate(int newDiscountRate)
    {
        if (newDiscountRate < 0 || newDiscountRate > 100)
        {
            this.discountRate = 0;
            return;
        }

        this.discountRate = newDiscountRate;
    }

    public int getDiscountRate()
    {
        return discountRate;
    }


    public int getDiscountPrice()
    {
        return retailPrice * (100 - discountRate) / 100;
    }
}
