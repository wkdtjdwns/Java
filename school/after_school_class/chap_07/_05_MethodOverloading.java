package chap_07;

public class _05_MethodOverloading {

	public static void main(String[] args) {
		
		BlackBox b1 = new BlackBox();
		b1.modelName = "까망이";
		
		// 파라미터 3개
		b1.record(false, false, 10);
		System.out.println();
		
		b1.record(true, true, 5);
		System.out.println();
		
		b1.record(true, false, 7);
		System.out.println();
		
		// 파라미터 1개 (오버로딩)
		b1.record(7);
		System.out.println();
		
		// 파라미터 0개 (오버로딩)
		b1.record();
	}
}
