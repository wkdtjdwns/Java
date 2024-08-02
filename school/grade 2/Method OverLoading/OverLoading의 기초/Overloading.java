package S21221_java30;

public class Overloading {

	public static void main(String[] args) {
		
		OverLoad ol = new OverLoad();
		
		ol.cal();
		
		ol.cal(3, 4);
		ol.cal(3.14, 9);
		
		ol.cal(3);
		ol.cal(3.14);
	}
}

/*
실행 결과
-----------------
인수 없음
인수 3 and 4
인수 3.14 and 9.0
인수 3
인수 3.14
*/
