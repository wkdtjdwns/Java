package poly.ex.pay1;

public abstract class PayStore {

	// 결재 수단이 추가되거나 삭제되는 변경이 일어나면 수정하는 부분
	public static Pay findPay(String option) {
		
		if (option.equals("kakao")) {
			return new KakaoPay();
		}
		
		else if (option.equals("naver")) {
			return new NaverPay();
		} 
		
		else {
			// Null은 깅장히 위험한 값이기 때문에 대체로 다루지 않는 것이 좋음.
			// 그래서 Null 값을 return하는 것보단
			// 차라리 클래스를 하나 생성해서 처리하는 것이 프로그램의 안정성을 높일 수 있음.
			return new DefaultPay();
		}
		
	}
}
