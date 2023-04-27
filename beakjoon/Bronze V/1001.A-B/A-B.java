import java.util.Scanner;

class Main {
    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int A, B;
	A = in.nextInt();
	B = in.nextInt();
	in.close();
	System.out.println(A - B);
    }
}
