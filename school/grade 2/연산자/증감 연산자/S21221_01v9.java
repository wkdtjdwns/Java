package S21221_00;

public class S21221_01v9 {

	public static void main(String[] args) {
		
        int intX = 1;
        int intY = 1;
        int intXnum = ++intX + 10;
        int intYnum = intY++ + 10;
        
        System.out.println("++intXnum : "  + intXnum + ", intX : " + intX);
        System.out.println("intYnum++ : " + intYnum++ + ", intY : " + intY);
	}
}

/*
실행 결과
------------------------
++intXnum : 12, intX : 2
intYnum++ : 11, intY : 2
*/
