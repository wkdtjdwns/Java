import java.math.BigInteger;
import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
	
	// 입력 조건에 m과 n의 최댓값이 10의 1,000 제곱
	// int로는 부족함
	
	// int와 BigInteger의 차이점
        // int의 범위는 '-2,147,483,648~2,147,483,647'이지만
        // BigInteger의 범위는 문자열 형태로 이루어져 있어 무한임
	
	BigInteger n = sc.nextBigInteger();
	BigInteger m = sc.nextBigInteger();
	sc.close();
	    
	// BigInteger 계산법
        // 문자열 형태로 이루어져 있기에 사칙연산이 안됨
        // 따라서 BigInteger의 값을 계산을 하려면 클래스 내부의 함수를 이용해야 함
	System.out.println(n.divide(m)); // 나누기
	System.out.println(n.remainder(m)); // 나머지
    }
}
