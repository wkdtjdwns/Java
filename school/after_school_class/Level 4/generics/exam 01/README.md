# 문제 1: 다중 타입의 상자 클래스

다양한 타입의 아이템을 담을 수 있는 상자 클래스를 제네릭스를 사용하여 구현하세요. 이 상자 클래스는 두 가지 타입의 아이템을 담을 수 있어야 합니다. 상자 클래스는 다음 조건을 만족해야 합니다.

1. **클래스 이름**: `Box`
2. **제네릭 타입**: 두 개의 타입 매개변수 `T`와 `U`를 가집니다.
3. **필드**:
    - 첫 번째 아이템을 담는 `item1` (타입: `T`)
    - 두 번째 아이템을 담는 `item2` (타입: `U`)
4. **생성자**: 두 개의 매개변수를 받아 각각 `item1`과 `item2`를 초기화합니다.
5. **메서드**:
    - `getItem1()`: 첫 번째 아이템을 반환합니다.
    - `getItem2()`: 두 번째 아이템을 반환합니다.
    - `displayItems()`: 두 아이템을 출력합니다.

다음 예제와 같은 코드가 실행될 수 있도록 `Box` 클래스를 작성하세요.

```java
public class Main {
    public static void main(String[] args) {
        Box<String, Integer> box1 = new Box<>("Apple", 10);
        box1.displayItems();

        Box<Double, Character> box2 = new Box<>(3.14, 'A');
        box2.displayItems();
    }
}
```

출력 예시:
```
Item 1: Apple, Item 2: 10
Item 1: 3.14, Item 2: A
```
