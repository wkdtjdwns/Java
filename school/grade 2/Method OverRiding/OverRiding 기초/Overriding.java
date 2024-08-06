package S21221_java31;

class OverridingA {

	public void cal(int it) {
		System.out.println("부모 A의 cal(" + it + ") 함수 실행");
	}
}

class OverridingB extends OverridingA {

	public void cal() {
		System.out.println("자식B의 cal() 함수 실행");
	}
}

public class Overriding {

	public static void main(String[] args) {
		
		OverridingA a = new OverridingA();
		a.cal(8);
		
		OverridingB b = new OverridingB();
		b.cal();
		
		OverridingB bb = new OverridingB();
		bb.cal();
	}
}

/*
실행 결과
-------------------------
부모 A의 cal(8) 함수 실행
자식B의 cal() 함수 실행
자식B의 cal() 함수 실행
*/
