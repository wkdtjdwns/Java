package class1;

public class ClassStart2 {
					
	public static void main(String[] args) {
		
		// 배열을 사용하여 코드를 다시 작성하였을 때
		// 1. 학생이 추가되어도 배열에 데이터만 추가하면 됨. (변수 추가 X)
		// 2. 출력을 반복문을 통해 배열을 순차적으로 탐색하므로, 학생이 추가되어도 출력 코드를 추가할 필요가 없음.
		
		// 변수 및 출력문을 추가할 필요 없이 배열에 값을 추가만하면 출력이 됨 -> 문제 해결
		
		String[] stuNames = { "홍길동", "장발장", "임꺽정", "로미오" };
		int[] stuAges = { 15, 16, 17, 20 };
		int[] stuGrades = { 90, 80, 99, 70 };
		
//		String studentName1 = "홍길동";
//		int studentAge1 = 15;
//		int studentGrade1 = 90;
//
//		String studentName2 = "장발장";
//		int studentAge2 = 16;
//		int studentGrade2 = 80;
		
//		System.out.println("이름 : " + stuName1 + " 나이 : " + stuAge2 + "세 성적 : " + stuGrade1 + "점");

		for (int i = 0; i < stuNames.length; i++)
			System.out.println("이름 : " + stuNames[i] + " 나이 : " + stuAges[i] + "세 성적 : " + stuGrades[i] + "점");
		
		// 위 방식은 코드 변경은 최소화 되었으나 한 학생의 데이터가 3개의 배열로 나눠서 관리가 됨.
		// 데이터를 변경, 삭제할 때 매우 조심히 작업을 해야함.
		// 따라서 위와 같은 코드는 컴퓨터가 볼 때는 전혀 문제가 없지만 사람이 관리하기엔 좋은 코드는 아님.
		
		// 그래서 클래스를 도입함!!
		// 클래스를 사용해 학생이라는 개념을 만들고, 각각의 학생별로 본인의 이름, 나이, 성적을 관리함!!
	}
}
