import java.util.Scanner;

class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A, B;
    A = sc.nextInt();
    B = sc.nextInt();
    sc.close();
		
    // 삼항연산자는 중첩할 수 있다.
    // A가 B보다 크면 >, 작으면 <, 같으면 ==를 str변수에 대입함    
    String str = (A > B) ? ">" : (A < B) ? "<" : "=="; 
    System.out.println(str);
    }
}
