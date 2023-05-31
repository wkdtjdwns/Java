package exam;

public class Ex06 {
//  SUNGIL 의 각 알파벳의 아스키코드의 합을 구하시오.
	public static void main(String[] args) {
		
		System.out.println('S');                               // char형은 그냥 출력할 때에는 문자로 나오지만,
		System.out.println('S' + 'U' + 'N' + 'G' + 'I' + 'L'); // 연산이 들어간다면 int형 즉, 숫자로 나온다.
		
		// 또 다른 풀이
		char s = 'S';
		char u = 'U';
		char n = 'N';
		char g = 'G';
		char i = 'I';
		char l = 'L';
		
		System.out.println(s+u+n+g+i+l); // (int)(s+u+n+g+i+l) 도 가능
	}
}
