package chap_07;

public class _01_Class {

	public static void main(String[] args) {
		
//		C언어 - 인기있는 언어 (취업하기 위해 포트폴리어를 작성할 때 빠지지 않는 언어일 정도)
//		     - 대표적인 절차형 언어
		
//		C언어로는 힘든 현실 세계를 표현하기 위해 만들어진 언어들
//		Java, C++, C# - 객체지향 언어
//		              - 장점 -> 유지 보수성 ()
//		                    -> 높은 재사용성 (어떠한 클래스를 만든 다음 언제든 사용할 수 있음)
		
//		차량용 블랙박스 구현
//		모델명, 해상도, 가격, 색상
		
//		첫 번째 제품
		String modelName = "까망이"; // 모델명
		String resolution = "FHD"; // 해상도
		int price = 20000;         // 가격
		String color = "Black";    // 색상
		
//		두 번째 제품
		String modelName2 = "하양이";
		String resolution2 = "UHD";
		int price2 = 50000;
		String color2 = "White";
		
//		두개의 제품을 만드는 데에만 8개의 변수가 생성됨
//		만약 새로운 제품을 만든다면 또 다른 4개의 변수가 생길 것임
//		그런데 이 상태에서 수정사항이 생긴다면 모든 변수들을 수정해야함 -> 유지 보수가 힘들어짐
//		또한 재사용하기에도 부담스러워짐
		
//		위와 같은 이유로 Class(클래스)를 사용함
//		사용법 - 클래스명 변수명 = new 클래스명(); -> 인스턴스화
		
//		BlackBox 클래스로부터 bbox 객체 생성 (인스턴스화)
//		bbox는 BlackBox 클래스의 인스턴스라고 부름
		BlackBox bbox = new BlackBox(); // 까망이를 넣을 수 있는 객체 생성
		                                // "BlackBox" 라는 이름의 클래스를 가져와서 bbox 변수로 사용함
		                                // bbox 라는 변수에 "BlackBox" 라는 이름의 클래스를 복사해서 집어 넣음
		
		BlackBox bbox2 = new BlackBox(); // 햐양이를 넣을 수 있는 객체 생성
	}
}
