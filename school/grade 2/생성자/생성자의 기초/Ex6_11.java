package s21200_java90;

class Data_1 {
	int value;
	
	// Data_1() { }; // compile 시 .class 파일에 자동으로 생성함.
}

class Data_2 {
	int value;

	Data_2() { }; // 기본 생성자를 직접 만듦 (생성자를 하나 만들어서 자동으로 생성되지 않음.)
	
	Data_2(int x) { // 매개변수가 있는 생성자
		value = x;
	}
}

public class Ex6_11 {
	
	public static void main(String[] args) {
		
		Data_1 d1 = new Data_1();
		
		// 생성자를 임의로 생성했을 때 기본 생성자를 자동으로 생성해 주지 않음. 
		// -> 기본 생성자를 직접 만들어주지 않으면 오류 발생
		Data_2 d2 = new Data_2();
	}
}
