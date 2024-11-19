package arraylist.ArrayList01;

import java.util.Arrays;
import java.util.ArrayList;

public class Array01_v2_remove_range {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();
	        list.add("One");
	        list.add("Two");
	        list.add("Three");
	        list.add("Four");
	        
	        System.out.println("--------------------------------------------");
	        System.out.println("* Array와 ArrayList 저장된 내용");        
	        System.out.println("--------------------------------------------");
	        
	        System.out.print("ArrayList    : ");
	        for (String str : list) {
	            System.out.print(str + " ");
	        }
	        
	        System.out.println("");
	        // System.out.println(list); -> ArrayList 전체 출력
	        
	        // 범위 삭제명 subList (int index부터, int index 바로 전까지)
	        list.subList(1, 3).clear(); // 삭제 범위 index 1부터 3전까지
	        System.out.print("ArrayList : ");
	        for (String str : list) { // 데이터 하나씩 출력 
	            System.out.print(str + " ");
	        }
	        // System.out.println("ArrayList 삭제 후: " + list); -> ArrayList 전체 출력
	}
}

/* 실행 결과
 * --------------------------------------------
 * * Array와 ArrayList 저장된 내용
 * --------------------------------------------
 * ArrayList    : One Two Three Four 
 * ArrayList : One Four 
 */
