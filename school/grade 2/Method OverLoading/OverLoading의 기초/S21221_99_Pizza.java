package S21221_02;

public class S21221_99_Pizza {
	
	int size;
	String type;
	
	public S21221_99_Pizza2() { // S21221_99_Pizza라는 이름의 메소드 선언!
		size = 12;
		type = "슈퍼슈프림;";
	}

	public S21221_99_Pizza2(int s, String t) { // 파라미터의 개수가 다름 -> 사용 가능!
		size = s;
		type = t;
	}
	
	public static void main(String[] args) {
		
		S21221_99_Pizza2 obj1 = new S21221_99_Pizza2(); // 인스턴스가 일어남
		System.out.println("Size1: " + obj1.size + " type: " + obj1.type);
		
		S21221_99_Pizza2 obj2 = new S21221_99_Pizza2(24, "포테이토"); // 인스턴스가 일어남
		System.out.println("Size1: " + obj2.size + " type: " + obj2.type);
	}
}

/*
실행 결과
--------------------------
Size1: 12 type: 슈퍼슈프림;
Size1: 24 type: 포테이토
*/
