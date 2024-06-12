# 구체적인 의존

- `BadObjectPrinter`는 구체적인 타입인 `Car`, `Dog`를 사용함.
- 따라서 이후에 출력해야 할 구체적인 클래스가 10개로 늘어나면 클래스에 맞춰 메서드도 10개 늘어나야 함.
- 이렇게 `BadObjectPrinter` 클래스가 구체적인 특정 클래스인 `Car`, `Dog`를 사용하는 것을 `BadObjectPrinter`는 `Car`, `Dog`에 **의존한다고 표현**함.
- 이 문제를 해결하기 위해 자바에서는 객체의 정보를 사용할 때 다형적 참조 문제를 해결해줄 `Object` 클래스와 메서드 오버라이딩 문제를 해결해 줄 `Object.toString()` 메서드가 있음.

# 추상적인 의존

- `Car`, `Dog`와 같은 구체적인 클래스를 사용하는 것이 아니라 추상적인 `Object` 클래스를 사용함.
- 이렇게 `ObjectPrinter` 클래스가 `Object` 클래스를 사용하는 것을 `ObjectPrinter` 클래스가 `Object` 클래스에 **의존한다고 표현**함.
- 이렇게 `BadObjectPrinter` 클래스가 구체적인 특정 클래스인 `Car`, `Dog`를 사용하는 것을 `BadObjectPrinter`는 `Car`, `Dog`에 **의존한다고 표현**함.
- 이 문제를 해결하기 위해 자바에서는 객체의 정보를 사용할 때 다형적 참조 문제를 해결해줄 `Object` 클래스와 메서드 오버라이딩 문제를 해결해 줄 `Object.toString()` 메서드가 있음.
    
    ![image](https://github.com/wkdtjdwns/Java/assets/128266768/19b96f6c-8a70-403e-b2d7-3062a605656c)
    

## OCP 원칙

- 객체지향언어의 원칙 중 하나임.
    
- **OPEN**: 새로운 클래스를 추가하고, `toString()`을 오버라이딩해서 기능을 확장할 수 있음.
  
- **CLOSED**: 새로운 클래스를 추가해도 `Object`와 `toString()`을 사용하는 클라이언트 코드인 `ObjectPrinter`는 변경하지 않아도 됨.
