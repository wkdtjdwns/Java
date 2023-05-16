package chap_01;

public class _04_Comment {
	public static void main(String[] args) {
		System.out.println("(10분전) 잠시 후 특강이 시작됩니다. 학생여러분 착석을 부탁드립니다");
		// 코드를 잠시 실행하지 않도록 주석으로 처리할 수 있다.
		// 주석표시(//)를 하지 않으면 오류가 뜬다. 
		// 코드를 주석 표시 할때는 앞에 표시 하는 것이 좋다. 
//      System.out.println("(5분전) 잠시 후 특강이 시작됩니다. 학생여러분 착석을 부탁드립니다");
//      System.out.println("지금부터 특강을 시작하겠습니다.");
		
		// 프로그래머의 의도를 주석으로 나타내어 다른 사람들이 봤을 때 이해하기 쉽도록 활용할 수 있다.
		int size = 120;
		size = size + 10; // 어린이는 발이 빨리 자라기 때문에 사이즈 10만큼 더 큰 신발을 구매하려고 한다.
		System.out.println("신발 사이즈" + size + "으로 보여주세요.");
		
		// 한줄 주석 => (//) 사용, 단축기 = (ctrl + shift + c) or (ctrl + /)
		// 여러 줄 주석 => (/* ~~~~~ */) 사용, 단축기 = 블록설정 후, (ctrl + shift + /)
		
/*
		 int a = 10;
		 int b = 20;
		 System.out.println(a + b);
*/
	}

}
