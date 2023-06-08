package chap_06;

public class _03_Return {

//	public static String getPhoneNumber() // 메소드를 만드는 순간 void가 없기 때문에 return 값을 정해주기 전까지는 오류가 생김!
//	{
//		
//	}
	
	public static String getPhoneNumber() // void 자리에 String -> return 값으로 String 형 값을 넣겠다는 뜻
	{
		String phoneNumber = "02-1234-4567";
		
		// return 값이 있기 때문에 굳이 출력할 필요가 없음 
		return phoneNumber; // 이 메소드를 호출하면 phoneNumber의 값이 생긴다는 뜻
	}
	
	public static String getAddress()
	{
		// 별도의 작업 없이 return만 해주어도 상관 없음
		return "서울시 강남구";
	}
	
	public static String getAcivity()
	{
		return "볼링장, 탁구장, 노래방, 사우나";
	}
	
	public static void main(String[] args) {
		
		// 메소드 내에서 출력해주지 않았기 때문에 
		
		// 별토로 값을 받아서
		String phoneNumber = getPhoneNumber(); // String 변수 phoneNumber에 위에 있는 메소드가 return하는 값을 저장함
		
		// 출력을 해줘야함
		System.out.println(phoneNumber);
		
		// 별토로 값을 받아서
		String address = getAddress();
		
		// 출력을 해줘야함
		System.out.println(address);
		
		// 하지만 별도의 작업 없이 출력을 해주어도 상관 없음 (굳이 변수를 선언하는 것에 메모리를 사용하지 않아도 됨 / 최적화)
		System.out.println(getAcivity());
	}
	
}
