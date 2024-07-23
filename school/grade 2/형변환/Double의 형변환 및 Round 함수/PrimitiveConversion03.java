package S21221_00;

public class PrimitiveConversion03 {

	public static void main(String[] args) {
		
        double pi = 3.141592;
        
        // res 1 : 3
        System.out.println("결과 1 : " + (int)pi);
        
        // res 2 : 3.141592
        System.out.println("결과 2 : " + pi);
        
        // res 3 : 3141.592
        System.out.println("결과 3 : " + 1000 * pi);
        
        // res 4 : 3142
        System.out.println("결과 4 : " + Math.round(pi * 1000));
        
        // res 5 : 3.142
        System.out.println("결과 5 : " + Math.round(pi * 1000) / 1000.0);
        
        // res 6 : 3.141
        System.out.println("결과 6 : " + (int)(pi * 1000) / 1000.0);
	}
}

/*
실행 결과
-----------------
결과 1 : 3
결과 2 : 3.141592
결과 3 : 3141.592
결과 4 : 3142
결과 5 : 3.142
결과 6 : 3.141
*/
