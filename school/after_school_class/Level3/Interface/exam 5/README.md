# 문제 풀이

```
아래에 있는 코드를 보고, 요구 사항과 실행 결과에 맞게 완성하시오.
(단, 아래의 코드는 건드리지 않음.)
```

    
```java
package poly.ex.sender;

public class SendMain {

  public static void main(String[] args) {
    
    Sender[] senders = { new EmailSender(), new SmsSender(), new FaceBookSender() };
    
    for (Sender sender : senders) {
      sender.sendMessage("환영합니다!");
    }
  }
}
```
    

```
다중 메세지 발송
- 한 번에 여러 곳에 메세지를 발송하는 프로그램을 개발하자.
- 메인코드를 보고 클래스를 완성하시오.

 요구사항
 1. 다형성을 활용해야 한다.
 2. Sender 인터페이스를 구현하고 사용해야 한다.
 3. EmailSender.java, SmsSender.java, FaceBookSender.java 를 구현하시오.


 실행결과
 메일을 발송합니다: 환영합니다!
 SMS룰 발송합니다: 환영합니다!
 페이스북에 발송합니다: 환영합니다!
```

</aside>
