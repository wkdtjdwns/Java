# 문제 2: 사용자와 상품 관리 클래스

사용자와 상품 정보를 저장하고 관리하는 제네릭 클래스를 구현하세요. 이 클래스는 다음 조건을 만족해야 합니다.

1. **클래스 이름**: `Manager`
2. **제네릭 타입**: 두 개의 타입 매개변수 `U`와 `P`를 가집니다. `U`는 사용자(User) 타입, `P`는 상품(Product) 타입입니다.
3. **필드**:
    - 사용자 정보를 담는 `user` (타입: `U`)
    - 상품 정보를 담는 `product` (타입: `P`)
4. **생성자**: 사용자와 상품을 매개변수로 받아 각각 `user`와 `product`를 초기화합니다.
5. **메서드**:
    - `getUser()`: 사용자 정보를 반환합니다.
    - `getProduct()`: 상품 정보를 반환합니다.
    - `displayInfo()`: 사용자와 상품 정보를 출력합니다.

다음 예제와 같은 코드가 실행될 수 있도록 `Manager` 클래스를 작성하세요.

```java
public class Main {
    public static void main(String[] args) {
        User user = new User("John Doe");
        Product product = new Product("Laptop", 1500);

        Manager<User, Product> manager = new Manager<>(user, product);
        manager.displayInfo();
    }
}

class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
```

출력 예시:

```
User: John Doe
Product: Laptop, Price: 1500.0
```
