package S21221_java20;

public class Chap01 {

	public static void main(String[] args) {
		
		Student s = new Student();
		s.pub(); // public
		s.pro(); // protected
		s.def(); // default
		// s.pri(); // private (에러 발생)
	}
}

/*
실행 결과
----------
public: 15
protected
default
*/
