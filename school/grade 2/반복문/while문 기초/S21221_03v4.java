package S21221_00;

public class S21221_03v4 {

	public static void main(String[] args){
		
        int sum = 0;
        int i = 0;
        
        while(true) {
            if(sum > 100) break;
            ++i;
            sum += i;
            System.out.println("i : " + i + " sum : " + sum);
        }
        
        System.out.println("=====================");
        System.out.println("i : " + i + " sum : " + sum);
	}
}

/*
실행 결과
-----------------------
i : 1 sum : 1
i : 2 sum : 3
i : 3 sum : 6
i : 4 sum : 10
i : 5 sum : 15
i : 6 sum : 21
i : 7 sum : 28
i : 8 sum : 36
i : 9 sum : 45
i : 10 sum : 55
i : 11 sum : 66
i : 12 sum : 78
i : 13 sum : 91
i : 14 sum : 105
=====================
i : 14 sum : 105
*/
