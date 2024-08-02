package S21221_02;

// 피자 사이즈가 25 이상일 경우 해당 size에 +2, type에 감자칩을 추가하여 출력
public class S21221_99_Pizza2 {
	
	int size;
	String type;
	
	public S21221_99_Pizza() { // S21221_99_Pizza라는 이름의 메소드 선언!
		size = 12;
		type = "슈퍼슈프림;";
	}

	public S21221_99_Pizza(int s, String t) { // 파라미터의 개수가 다름 -> 사용 가능!
		size = s;
		type = t;
		
		// 문제의 정답
		if (size >= 25) {
			size += 2;
			type += " + 감자칩";
		}
	}
	
	// 위와 같은 메소드들을 만들어서 필요할 때마다 가져다 사용하는 것으로 인해서
	// 같은 코드를 다시 쓰는 일도 줄어들고, 별도의 수정도 1번만 해주면 되는 등의 장점이 생김.
	
	public static void main(String[] args) {
		
		S21221_99_Pizza obj1 = new S21221_99_Pizza(); // 인스턴스가 일어남
		System.out.println("Size1: " + obj1.size + " type: " + obj1.type);
		
		S21221_99_Pizza obj2 = new S21221_99_Pizza(24, "포테이토"); // 인스턴스가 일어남
		System.out.println("Size1: " + obj2.size + " type: " + obj2.type);
		
		S21221_99_Pizza obj3 = new S21221_99_Pizza(28, "포테이토"); // 인스턴스가 일어남
		System.out.println("Size1: " + obj3.size + " type: " + obj3.type);
	}
}

/*
실행 결과
--------------------------------
Size1: 12 type: 슈퍼슈프림;
Size1: 24 type: 포테이토
Size1: 30 type: 포테이토 + 감자칩
*/
