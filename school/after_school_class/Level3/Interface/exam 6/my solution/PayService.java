package poly.ex.pay1;

public class PayService {

	public void processPay(String option, int amount) {
		boolean result = false;
		System.out.println("결제를 시작합니다: option = " + option + ", amout = " + amount);
		
		Pay[] pays = { new KakaoPay(), new Naverpay() };
		
		for (Pay pay : pays ) {
		
			if (option.equals(pay.getName())) {
				result = pay.pay(amount);
			}
		}
	
		if (result) {
			System.out.println("결제에 성공했습니다.");
			return;
		}
		
		System.out.println("결제에 실패했습니다.");
	}
}
