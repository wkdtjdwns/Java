package chap_03;

public class _03_StringCompare {
	public static void main(String[] args) {
		String s1 = "Java";
		String s2 = "Python";
		
		// 문자열을 비교할 때는 == 을 사용하지 않는다.
		// 대신 ★equals()★ 를 사용한다
		System.out.println(s1.equals(s2)); // false
		
		s2 = "java"; // 대소문자까지 비교
		System.out.println(s1.equals(s2)); // false
		
		// 대문자로 통일 해서 비교
		System.out.println(s1.toUpperCase().equals(s2.toUpperCase())); // true
		
		// 대소문자 관계없이 비교
		System.out.println(s1.equalsIgnoreCase(s2)); // true
		
		System.out.println("=============");
		
		s1 = "1234";
		s2 = "1234";
		System.out.println(s1.equals(s2)); // 문자열의 "내용"을 비교
		System.out.println(s1 == s2); // 문자열의 "참조값(주소값)"을 비교
		
		s1 = new String("1234"); // 새로운 주소에 저장함
		s2 = new String("1234"); // 새로운 주소에 저장함
		System.out.println(s1.equals(s2)); // 문자열의 "내용"을 비교 => 내용을 비교하는 것이라 주소가 달라도 true 출력됨
		System.out.println(s1 == s2); // 문자열의 "참조값(주소값)"을 비교 => 새로운 주소에 변수의 내용을 저장해서 false 출력됨
		
	}
}
