package arraylist.ArrayList01;

import java.util.Arrays;
import java.util.ArrayList;

public class Array01_v4_get {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();
		
		list.add("One");
		list.add("Two");
		list.add("Three");
		list.add("Four");
		
		System.out.println("--------------------------------------------");
		System.out.println("* ArrayList에 저장된 내용");
		System.out.println("--------------------------------------------");
		
		System.out.print("ArrayList:	");
		for (String str : list) { // 데이터 전체 출력
			System.out.print(str + " ");
		}
		System.out.println("");
		
		System.out.println(list.get(3));
		System.out.println(list.get(2));
		System.out.println(list.get(1));
		System.out.println(list.get(0));
		System.out.println(list.subList(1, 3));
	}
}

/* 실행 결과
 * --------------------------------------------
 * * ArrayList에 저장된 내용
 * --------------------------------------------
 * ArrayList:	One Two Three Four 
 * Four
 * Three
 * Two
 * One
 * [Two, Three]
 */
