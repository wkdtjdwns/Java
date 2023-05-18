package chap_03;

public class _01_String1 {
	public static void main(String[] args) {
		// 기본적인 변수 선언 및 할당
		String s = "I like Java and Python and C.";
		System.out.println(s);
		
		// 문자열의 길이 - length()
		System.out.println(s.length());
		
		// 대소문자 변환 - upper() => 대문자로 변환 / lower() => 소문자로 변환
		System.out.println(s.toUpperCase()); // 전부 다 대문자로 출력
		
		System.out.println(s.toLowerCase()); // 전부 다 소문자로 출력
		
		// 포함관계 - contains(문자) => 이 문자가 포함되어 있으면 true / 아니면 false
		System.out.println(s.contains("Java")); // Java가 포함되어 있으면 true / 포함되어 있지 않으면 false
		System.out.println(s.contains("C#")); // C#이 포함되어 있으면 true / 포함되어 있지 않으면 false
		
		// indexOf(찾고 싶은 문자) => 이 문자가 있는 위치 / 문자가 포함 되어 있지 않으면 "-1" 출력
		System.out.println(s.indexOf("Java")); // 7
		System.out.println(s.indexOf("C#"));
		System.out.println(s.indexOf("and")); // 처음으로 나온 위치를 출력함 (12) 
		System.out.println(s.lastIndexOf("and")); // 마지막으로 나온 위치를 출력함 (23)
		
		// startWith(문자) => 이 문자로 시작하면 true / 아니면 false
		System.out.println(s.startsWith("I like")); 
		
		// endWith(문자) => 이 문자로 끝나면 true / 아니면 false
		System.out.println(s.endsWith("C."));
		
	}
}
