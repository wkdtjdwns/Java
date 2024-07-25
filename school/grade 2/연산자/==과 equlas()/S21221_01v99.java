package S21221_00;

public class S21221_01v99 {

	public static void main(String[] args) {
		
        String str1 = "abc";
        String str2 = "abc";
        
        System.out.println("기본 변수 == : " + (str1 == str2));
        System.out.println("기본 변수 equlas : " + (str1.equals(str2)));
        
        // 참조 변수로 사용한 경우
        String str3 = new String("abc");
        String str4 = new String("abc");
        System.out.println("참조 변수 == : " + (str3 == str4));
        System.out.println("참조 변수 equlas : " + (str3.equals(str4)));
	}
}

/*
실행 결과
-----------------------
기본 변수 == : true
기본 변수 equlas : true
참조 변수 == : false
참조 변수 equlas : true
*/
