package test0000;

public class OverloadingEx02 {

	// 전역 변수
	String name;
	String company = "성일정보고";
	String model = "2학년12반";
	String number = "비공개";
	
	// 생성자
	public OverloadingEx02(String name) {
		this.name = name;
	}
	
	// 생성자 오버로딩
	public OverloadingEx02(String name, String number) {
		this.name = name;
		this.number = number;
	}
	
	// 메소드
	public void print() {
		System.out.println("이름: " + name + "\n학교: " + company + "\n학급: " + model + "\n핸드폰: " + number);
	}
	
	public static void main(String[] args) {
		
		OverloadingEx02 ol1 = new OverloadingEx02("권원태");
		ol1.print();
		System.out.println();
		
		OverloadingEx02 ol2 = new OverloadingEx02("천경호", "010-0101-1234");
		ol2.company += " 반장";
		ol2.print();
		System.out.println();
		
		
		OverloadingEx02 ol3 = new OverloadingEx02("이주선");
		ol3.company += " 부반장";
		ol3.print();
	}
}

/*
실행 결과
----------------------
이름: 권원태
학교: 성일정보고
학급: 2학년12반
핸드폰: 비공개

이름: 천경호
학교: 성일정보고 반장
학급: 2학년12반
핸드폰: 010-0101-1234

이름: 이주선
학교: 성일정보고 부반장
학급: 2학년12반
핸드폰: 비공개
*/
