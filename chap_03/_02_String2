package chap_03;

public class _02_String2 {
	public static void main(String[] args) {
		String s = "I like Java and Python and C.";
		
		// 문자열 변환 - replace(바꾸고 싶은 문자, 바꿀 문자)
		System.out.println(s.replace("and", ",")); // and를 ,로 변환 시킴
		
		// substring(시작 위치) => 인덱스 기준 7번째 부터 시작 ==> 이전 내용은 삭제
		System.out.println(s.substring(7)); // Java and Python and C.
		// substring(시작 위치, 마지막 위치) => 인덱스 기준으로 7 ~ 10번째만 출력 ==> 다른 내용은 삭제
		System.out.println(s.substring(7, 11)); // Java
		// substring(시작 위치) => 시작 위치에 함수 넣어도 됨
		System.out.println(s.substring(s.indexOf("Java"))); // Java and Python and C.
		
		// Java and Python 출력
		System.out.println(s.substring(s.indexOf("Java"), s.indexOf(" and C")));
		
		// 공백제거 - trim()
		s = "           I lova Java         and Python.    ";
		System.out.println(s); // 공백도 같이 출력됨
		
		System.out.println(s.trim()); // 앞뒤 공백 제거 (단어 사이의 공백은 제거 X)
		
		// 문자열 결합 - +기호 사용, concat() 함수 사용
		String s1 = "Java";
		String s2 = "Python";
		System.out.println(s1 + s2); // JavaPython 
		System.out.println(s1 + ", " + s2); // Java, Python
		// .concat() 뒤에 여러번 .concat() 가능함
		System.out.println(s1.concat(", ").concat(s2)); // Java, Python
		
	}
}
