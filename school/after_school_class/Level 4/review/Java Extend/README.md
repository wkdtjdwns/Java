# 클래스를 이용하여 햄버거를 자동으로 만드는 프로그램을 작성하시오.

## 조건

- 햄버거의 종류는 햄버거, 치즈버거, 새우버거 3가지
- 각 버거는 각각의 클래스로 생성
- 버거 이름을 담기 위한 `name` 변수 정의
- 재료 정보를 표시하는 `cook()` 메소드 정의
- 공통 부분은 상속 및 메소드 오버라이딩으로 처리

<br>

# 각 버거의 재료 정보

## 햄버거

- 양상추
- 패티
- 피클

## 치즈버거

- 양상추
- 패티
- 피클
- **치즈**

## 새우버거

- 양상추
- 패티
- 피클
- **새우**

<br>

## **출력코드 및 결과 화면**

```java
public class HamburgerMain {
    public static void main(String[] args) {
        HamBurger[] hamBurgers = new HamBurger[3];
        hamBurgers[0] = new HamBurger();
        hamBurgers[1] = new CheeseBurger();
        hamBurgers[2] = new ShrimpBurger();

        System.out.println("주문하신 메뉴를 만듭니다.");
        System.out.println("-------------");
        for (HamBurger hamBurger : hamBurgers) {
            hamBurger.cook();
            System.out.println("-------------");
        }
        System.out.println("메뉴 준비가 완료되었습니다.");
    }
}
```

```
주문하신 메뉴를 만듭니다.
-------------
햄버거를 만듭니다.
빵 사이에 들어가는 재료는?
> 양상추
+ 패티
+ 피클
-------------
치즈버거를 만듭니다.
빵 사이에 들어가는 재료는?
> 양상추
+ 패티
+ 피클
+ 치즈
-------------
새우버거를 만듭니다.
빵 사이에 들어가는 재료는?
> 양상추
+ 패티
+ 피클
+ 새우
-------------
메뉴 준비가 완료되었습니다.
```

## 작성할 클래스

1. `HamBurger` 
2. `CheeseBurger` 
3. `ShrimpBurger`
