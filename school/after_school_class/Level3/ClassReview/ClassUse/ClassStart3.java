package class1;

public class ClassStart3 {
					
	public static void main(String[] args) {

		// 클래스를 사용하는 것이기 때문에 본체를 직접 접근해서 사용하면 데이터가 삭제되거나 할 수 있음.
		// -> 클래스의 복사본을 가져다가 사용함.
		Student stu1 = new Student(); // 메모리에 학생 클래스를 생성하여 stu1에 담아둠.
		
		// .(닷) = 해당 인스턴스 변수의 클래스로 접근함.
		stu1.stuName = "홍길동";
		stu1.stuAge = 15;
		stu1.stuGrade = 90;
		
		Student stu2 = new Student();
		
		stu2.stuName = "장발장";
		stu2.stuAge = 16;
		stu2.stuGrade = 80;

		System.out.println(stu1);
		System.out.println(stu2);
		
		System.out.println("이름 : " + stu1.stuName + " 나이 : " + stu1.stuAge + "세 성적 : " + stu1.stuGrade + "점");
		System.out.println("이름 : " + stu2.stuName + " 나이 : " + stu2.stuAge + "세 성적 : " + stu2.stuGrade + "점");
	}
}

/*
 * 클래스와 사용자 정의 타입
 * - 타입 : 데이터의 종류나 형태를 나타냄.
 * - int는 정수 타입, String은 문자 타입
 * 
 * 클래스의 탄생 이유
 * - 학생 (Student)라는 타입을 만들면 좋지 않을까?
 * - 클래스를 사용하면 int, String과 같은 타입을 직접 생성할 수 있음.
 * - 사용자가 직접 정의하는 사용자 정의 타입을 만드려면 설계도가 필요하고, 이 설계도가 클래스임.
 * - 설계도인 클래스를 사용하여 실제 메모리에 만들어진 실체를 객체 또는 인스턴스라고 함.
 * - 클래스를 통해서 사용자가 원하는 종류의 데이터 타입을 마음껏 정의할 수 있음.
 * 
 * 참조 값을 변수에 보관하는 이유
 * 객체를 생성하는 new Student() 코드 자체에는 이름이 없음
 * 이 코드는 단순히 Student 클래스를 기반으로 메모리에 실제 객체를 만드는 기능만 함.
 * 띠라서 생성한 객체에 접근할 방법이 필요함.
 * 
 * 객체를 생성할 때 반환되는 참조값 (주소)를 알면 객체에 접근할 수 있음.
 * 따라서 반환되는 참조값 (주소)를 저장할 변수가 필요하며
 * 앞서 Student stu1로 선언한 변수(stu1)에 참조값을 저장하여 필요할 때 객체에 접근할 수 있음.
 * 
 * 정리
 * Student stu1 = new Student(); // Student 객체 생성
 * -> Student stu1 = 0x0099ff; // new Student()의 결과로 참조값(주소) 반환
 * stu1 = 0x0099ff; // stu1 변수에 주소값이 저장됨.
 */
