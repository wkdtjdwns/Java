package s21200_java90;

public class S21221_wrapper_01 {

	public static void main(String[] args) {
		
		// 기본 박싱
		System.out.println("--기본박싱 및 언박싱--------");
		Integer is1 = new Integer(127);
		Integer is2 = new Integer("127");
		
		// 언박싱
		int si1 = is1.intValue();
		int si2 = is2.intValue();

		System.out.println("기본박싱 is1:" + is1 + " 언박싱 si1:" + si1);
		System.out.println("기본박싱 is2:" + is2 + " 언박싱 si2:" + si2);
		
		System.out.println("기본박싱 is1:" + System.identityHashCode(is1) + " 언박싱:" + System.identityHashCode(si1));
		System.out.println("기본박싱 is2:" + System.identityHashCode(is2) + " 언박싱:" + System.identityHashCode(si2));
		
		System.out.println("--자동박싱 및 언박싱--------");
	}
}

/*
실행 결과
-----------------------------------------
--기본박싱 및 언박싱--------
기본박싱 is1:127 언박싱 si1:127
기본박싱 is2:127 언박싱 si2:127
기본박싱 is1:490150701 언박싱:1413246829
기본박싱 is2:1971851377 언박싱:1413246829
*/
