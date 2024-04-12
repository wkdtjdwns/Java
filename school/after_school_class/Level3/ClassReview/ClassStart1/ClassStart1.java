package class1;

public class ClassStart1 {
	
	// 학생 정보 출력 프로그램
	// 두 명의 학생 정보를 출력하는데, 각 학생은 이름, 나이, 성적을 가지고 있음.
			
	// 1. 홍길동, 15, 90
	// 2. 장발장, 16, 80
			
	// 출력 - 이름 : [이름] 나이 : [나이]세 성적 : [성적]점
			
	// 변수를 사용하여 학생 정보를 저장하고, 변수를 사용해서 학생 정보를 출력해보자.
					
	public static void main(String[] args) {
		
		String stuName1 = "홍길동";
		int stuAge1 = 15;
		int stuGrade1 = 90;

		String stuName2 = "장발장";
		int stuAge2 = 16;
		int stuGrade2 = 80;
		
		System.out.println("이름 : " + stuName1 + " 나이 : " + stuAge1 + "세 성적 : " + stuGrade1 + "점");
		System.out.println("이름 : " + stuName2 + " 나이 : " + stuAge2 + "세 성적 : " + stuGrade2 + "점");
		
		// 위 방식은 학생이 늘어 날 때마다 변수와 출력 코드를 계속 추가해야하는 문제가 생김!!
		// 같은 의미의 변수지만 같은 이름을 사용할 수 없기 때문에 변수가 계속 늘어남
		
		// 위 문제점을 배열을 사용해 해결해보자
	}
}
