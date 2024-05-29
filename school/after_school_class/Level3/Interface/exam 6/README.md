# 문제 풀이

```
아래에 있는 코드를 리펙토링하시오.
(단, PayMain의 코드는 변경하지 않아야 함.)
```

- **KakaoPay**
    
    ```java
    package poly.ex.pay0;
    
    public class KakaoPay {
    
    	public boolean pay(int amount) {
    		System.out.println("카카오페이 시스템과 연결합니다.");
    		System.out.println(amount + "원 결제를 시도합니다.");
    		return true;
    	}
    }
    ```
    
- **NaverPay**
    
    ```java
    package poly.ex.pay0;
    
    public class NaverPay {
    
    	public boolean pay(int amount) {
    		System.out.println("네이버페이 시스템과 연결합니다.");
    		System.out.println(amount + "원 결제를 시도합니다.");
    		return true;
    	}
    }
    ```
    
- **PayMain0**
    
    ```java
    package poly.ex.pay0;
    
    public class PayMain0 {
    
    	public static void main(String[] args) {
    		
    		PayService payService = new PayService();
    		
    		// kakao 결제
    		String payOption1 = "kakao";
    		int amount1 = 5000;
    		payService.processPay(payOption1, amount1);
    
    		// naver 결제
    		String payOption2 = "naver";
    		int amount2 = 10000;
    		payService.processPay(payOption2, amount2);
    
    		// 잘못된 결제 수단
    		String payOption3 = "apple";
    		int amount3 = 15000;
    		payService.processPay(payOption3, amount3);
    	}
    }
    ```
    
- **PayService**
    
    ```java
    package poly.ex.pay0;
    
    public class PayService {
    
    	public void processPay(String option, int amount) {
    		boolean result;
    		System.out.println("결제를 시작합니다: option = " + option + ", amout = " + amount);
    		
    		if (option.equals("kakao")) {
    			KakaoPay kakaoPay = new KakaoPay();
    			result = kakaoPay.pay(amount);
    		}
    		
    		else if (option.equals("naver")) {
    			NaverPay naverPay = new NaverPay();
    			result = naverPay.pay(amount);
    		}
    		
    		else {
    			System.out.println("결제 수단이 없습니다.");
    			result = false;
    		}
    		
    		if (result) {
    			System.out.println("결제에 성공했습니다.");
    		}
    		
    		else {
    			System.out.println("결제에 실패했습니다.");
    		}
    	}
    }
    ```
    
</aside>
