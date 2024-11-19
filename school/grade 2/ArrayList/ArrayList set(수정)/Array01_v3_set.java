package arraylist.ArrayList01;

import java.util.Arrays;
import java.util.ArrayList;

public class Array01_v3_set {

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
		
		// 수정 list.set(위치 index, 내용);
		list.set(0, "하나"); // 수정 위치, 내용
		list.set(1, "둘"); // 수정 위치, 내용
		list.set(2, "셋"); // 수정 위치, 내용
		list.set(3, "넷"); // 수정 위치, 내용
		
		System.out.print("ArrayList:	");
		for (String str : list) { // 데이터 전체 출력
			System.out.print(str + " ");
		}
		
		// System.out.println("ArrayList 수정 후: " + list); // ArrayList 전체 출력
	}
}

/* 실행 결과
 * --------------------------------------------
 * * ArrayList에 저장된 내용
 * --------------------------------------------
 * ArrayList:	One Two Three Four 
 * ArrayList:	하나 둘 셋 넷
 */
