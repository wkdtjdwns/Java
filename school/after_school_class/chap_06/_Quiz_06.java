package chap_06;

public class _Quiz_06 {

//	개인정보 값을 받으면 중요한 정보를 *로 치환하는 메소드를 만들어서 실행 결과와 같이 출력하시오.
	
//	실행 결과
//	이름 : 김**
//	주민번호 : 990130-1******
//	전화번호 : 010-1234-****
	
//	필요한 메소드
//	length() : 문자열 길이
//	substring() : 문자열 자르기
//	substring(4)
//	substring(4, 7)

	public static String gerHiddenData(String data, int index)
	{
		String hiddenData = data.substring(0, index);
		
		for (int i=index; i<data.length(); i++)
			hiddenData += "*";
		
		return hiddenData;
	}
	
	public static void main(String[] args) {
		
		String name = "김성일";
		String id = "990130-1234567";
		String phone = "010-1234-5678";
		
		System.out.println("이름 : " + gerHiddenData(name, 1));
		System.out.println("주민등록번호 : " + gerHiddenData(id, 8));
		System.out.println("전화번호 : " + gerHiddenData(phone, 9));
	}
}
