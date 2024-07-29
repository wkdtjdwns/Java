package S21221_00;

public class ListTest03 {

	// args라는 String 배열에 위에서 입력한 값들이 들어감
	public static void main(String[] args){
		
        System.out.println("매개변수의 개수 : " + args.length);
        
        for (int i = 0; i < args.length; i++) {
        	System.out.println("args[" + i + "] = \"" + args[i] + "\"");
        }
	}
}

/*
실행 결과
----------------------
매개변수의 개수 : 2
args[0] = "안녕"
args[1] = "안녕 세상아"
*/
