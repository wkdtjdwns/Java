# 문제 3: 커피 주문 관리 클래스

커피 주문을 관리하는 제네릭 클래스를 구현하세요. 이 클래스는 다음 조건을 만족해야 합니다.

1. **클래스 이름**: `CoffeeOrder`
2. **제네릭 타입**: 하나의 타입 매개변수 `T`를 가집니다.
3. **필드**:
    - 주문자 정보를 담는 `customer` (타입: `T`)
    - 커피 이름을 담는 `coffeeName` (타입: `String`)
4. **생성자**: 주문자와 커피 이름을 매개변수로 받아 각각 `customer`와 `coffeeName`을 초기화합니다.
5. **메서드**:
    - `getCustomer()`: 주문자 정보를 반환합니다.
    - `getCoffeeName()`: 커피 이름을 반환합니다.
    - `displayOrder()`: 주문자와 커피 이름을 출력합니다.

다음 예제와 같은 코드가 실행될 수 있도록 `CoffeeOrder` 클래스를 작성하세요.

```java
public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Alice");
        CoffeeOrder<Customer> order = new CoffeeOrder<>(customer, "Espresso");
        order.displayOrder();
    }
}

class Customer {
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
```

출력 예시:

```
Customer: Alice
Coffee: Espresso
```
