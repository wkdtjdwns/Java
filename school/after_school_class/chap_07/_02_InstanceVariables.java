package chap_07;

// 인스턴스 변수 - 객체 안에서만 사용되는 변수 (지역 변수와 개념은 유사하나 다른 것임)
public class _02_InstanceVariables {

	public static void main(String[] args) {
		
		// 첫 번째 제품 (까망이)
		BlackBox b1 = new BlackBox(); // 인스턴스화
		
		// BlackBox 클래스의 필드들을 호출해서 값 할당 
		b1.modelName = "까망이"; 
		b1.resolution = "FHD";
		b1.price = 20000;
		b1.color = "Black";
		
		// 값을 할당한 필드들을 출력하는 법
		System.out.println(b1.modelName);
		System.out.println(b1.resolution);
		System.out.println(b1.price);
		System.out.println(b1.color);
		
		// 두 번째 제품 (하양이)
		BlackBox b2 = new BlackBox(); // 인스턴스화
		
		// 위에서 값을 할당했지만 BlackBox 클래스에 직접적으로 값을 할당한 것이 아닌 클래스를 복사한 b1 인스턴스에 할당한 것이기 때문에 b2 인스턴스에는 아직 값이 할당되어 있지 않음
		// 정리 : 각각의 인스턴스끼리는 상호작용할 수 없음
		System.out.println(b2.modelName);
		System.out.println(b2.resolution);
		System.out.println(b2.price);
		System.out.println(b2.color);
		
		// 위와같은 이유로 값 할당을 따로 해주어야함
		b2.modelName = "하양이"; 
		b2.resolution = "UHD";
		b2.price = 50000;
		b2.color = "White";
		
		System.out.println(b2.modelName);
		System.out.println(b2.resolution);
		System.out.println(b2.price);
		System.out.println(b2.color);

		// 문자열 또한 클래스로 이루어져 있음
		String str = "자바"; // 평소에 사용하는 형태
			
		// 원래 사용해야 하는 형태
		String str2 = new String();
		str2 = "파이썬";
	}
}
