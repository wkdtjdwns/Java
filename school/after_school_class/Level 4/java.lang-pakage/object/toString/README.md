# Object.toString()

- `Object.toString()` 메서드는 객체의 정보를 문자열 형태로 제공함.
- 그래서 디버깅과 로깅에 유용하게 사용함.
- 이 메서드는 `Object` 클래스에 정의되므로 모든 클래스에서 상속받아사용할 수 있음.
- `Object`가 제공하는 `toString()` 메서드는 기본적으로 패키지를 포함한 객체의 이름과 참조값(해시코드)를 16진수로 제공함.

# println()과 toString()

- `toString()`의 결과를 출력한 코드와 `object`**를 **`println()`에 직접 출력한 코드의 결과가 완전히 같음.
    
    ```java
    Object object = new Object();
    String string = object.toString();
    
    // toString() 반환값 출력
    System.out.println(string);
    
    // object 직접 출력
    System.out.println(object);
    ```
    
    ---
    
- `System.out.println()` 메서드는 사실 내부에서 `toString()`을 호출함.
- `Object`타입 (자식 포함)이 `println()`의 인수로 전달되면 내부에서 `obj.toString()` 메서드를 호출해서 결과를 출력함.
- 따라서 `println()`을 사용할 때, `toString()`을 직접 호출할 필요 없이 객체를 바로 전달하면 객체의 정보를 출력할 수 있음.
