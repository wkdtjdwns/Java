package s21200_java90;

public class S21221_wrapper_00 {

	public static void main(String[] args) {
		
		// Wrapper (포장) class
		// 자바는 기본 타입ㅂ byte, char, short, int, long, float, double, boolean
		// 기본 타입의 값을 내부에 두고 포장할 수 있음. 이러한 객체를 wrapper(포장) 객체라고 함.
		// 포장 크래스는 Byte, Character, Short, Integer, Long, Float, Double, Boolean
		// 기본 타입의 값을 포장 객체로 만드는 것을 박싱(Boxing)이라고 함.
		// 반대로 포장에서 기본 타입의 값을 얻어 내는 것을 언박싱(Unboxing)이라고 함.
		
		int i1 = 126;
		int i2 = 126;
		
		System.out.println("--기본 타입 int--------------------");
		System.out.println("기본 값 i1:" + i1 + " HashCode: " + System.identityHashCode(i1));
		System.out.println("기본 값 i2:" + i2 + " HashCode: " + System.identityHashCode(i2));
		
		// 기본 박싱
		Integer is1 = new Integer(126);
		Integer is2 = new Integer("126");
		
		System.out.println("--기본 박싱 Integer----------------");
		System.out.println("is1:" + is1 + " HashCode: " + System.identityHashCode(is1));
		System.out.println("is2:" + is2 + " HashCode: " + System.identityHashCode(is2));
	
		is2 += is1;
		System.out.println("+is2:" + is2 + " HashCode: " + System.identityHashCode(is2));
		
		// 기본 언박싱
		int si1 = is1.intValue();
		int si2 = is2.intValue();
		
		System.out.println("--기본 언박싱 Integer----------------");
		System.out.println("si1" + si1 + " HashCode: " + System.identityHashCode(si1));
		System.out.println("si2" + si2 + " HashCode: " + System.identityHashCode(si2));
		
		si2 += si1;
		System.out.println("+si2:" + si2 + " HashCode: " + System.identityHashCode(si2));
	}
}

/*
실행 결과
-----------------------------------
--기본 타입 int--------------------
기본 값 i1:126 HashCode: 1113619023
기본 값 i2:126 HashCode: 1113619023
--기본 박싱 Integer----------------
is1:126 HashCode: 786041152
is2:126 HashCode: 1896294051
+is2:252 HashCode: 1684015092
--기본 언박싱 Integer---------------
si1126 HashCode: 1113619023
si2126 HashCode: 1113619023
+si2:252 HashCode: 1209669119
*/
