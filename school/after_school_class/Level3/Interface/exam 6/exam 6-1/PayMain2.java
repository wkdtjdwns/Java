package poly.ex.pay1;

import java.io.*;

public class PayMain2 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		PayService payService = new PayService();
		
		while (true) {
			System.out.print("결제 수단을 입력하세요:");
			String payOption = br.readLine();
			
			if (payOption.equals("exit")) {
				System.out.println("프로그램을 종료합니다");
				break;
			}
			
			System.out.print("결제 금액을 입력하세요:");
			int amount = Integer.parseInt(br.readLine());
			
			payService.processPay(payOption, amount);
		}
		
	}
}
