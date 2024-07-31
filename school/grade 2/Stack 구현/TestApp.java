package S21221_00;

// Scanner와 Stack을 사용하기 위한 import
import java.util.Scanner;
import java.util.Stack;

public class TestApp {

	public static void main(String[] args){

        Scanner sc = new Scanner(System.in); // Scanner를 변수에 저장함 (인스턴스화)

        System.out.print("스택의 수를 입력하세요 >>> ");
        int N = sc.nextInt(); // Scanner를 이용한 스택의 수 입력

        int[] array = new int[N]; // 입력된 수만큼 배열 생성

        for (int i = 0; i < N; i++) { // 위에서 입력된 수 만큼 반복함

            System.out.print("수열의 수를 입력하세요 >>> ");
            array[i] = sc.nextInt(); // Stack의 요소들을 입력함
        }

        Stack<Integer> stack = new Stack<>(); // 스택 생성
        StringBuffer bf = new StringBuffer(); // 스트링 버퍼 생성

        /*
         스트링 버퍼 (StringBuffer)란?
        - 문자열을 추가하거나 변경할 때 주로 사용하는 자료형임.
        - StringBuffer는 String 클래스의 인스턴스가 한 번 생성하면 그 값을 읽기만 할 수 있고 변경은 할 수 없는
                문제점을 해결하기 위해 나왔음.

        스르링 버퍼 (StringBuffer)를 사용하는 이유
        - String 인스턴스의 문자열은 덧셈 (+) 연산자로 결합할 수 있음.
            하지만 이 방법은 새로운 String 인스턴스를 생성하게 됨.
            덧셈 연산자를 통해 문자열과 함께 사용하면 자동으로 문자열 형변환이 이뤄지고 문자열이 결합됨.
            한 마디로 문자열을 결합할 수록 공간이 낭비되면서 실행 속도도 느려짐.
        - 위와 같은 이유로 StringBuffer 인스턴스를 이용해 문자열을 바로 추가하거나 변경해서
            공간의 낭비 없이 빠르게 사용함.

        스트링 버퍼 (StringBuffer)의 메소드
        - append(E) : 파라미터의 값을 문자열로 변환시켜 해당 문자열의 마지막에 추가함.
        - capacity() : StringBuffer 인스턴스의 현재 버퍼 크기를 반환함.
        - delete()와 deleteCharAt()
            delete(int n1, int n2) : 지정한 인덱스의 해당하는 부분의 문자열을 제거함.
            deleteCharAt(int n) : 해당 인덱스의 문자 1개만 제거함.

        - 비슷한 자료형으로는 스트링 빌더가 있음. (여러 개의 문자열을 더할 때 새로운 인스턴스를 생성해야 한다고 함.)
        */

        int num = 1; // 오름차순 수
        boolean result = true; // 스택에서 값을 뺄 수 있을지 여부

        for (int i = 0; i < array.length; i++) { // 배열의 수 만큼 반복

            int su = array[i]; // 현재 수열의 수

            if (su >= num) { // 현재 수열 값 >= 오름차순 자연수 : 값이 같아질 때까지 push() 수행

                while (su >= num) { // push()
                    stack.push(num++);
                    bf.append("+\n"); // StringBuffer에 줄바꿈 추가
                }

                // Stack에 값을 넣고 마지막 값을 뺌
                stack.pop();
                bf.append("-\n");

            } else { // 현재 수열 값 < 오릅차순 자연수 : pop()을 수행하여 수열 원소를 꺼냄
                int p = stack.pop();

                // 스택의 가장 위의 수가 만들어야 하는 수열의 수보다 크면 수열 출력 불가능
                
                // 스택의 가장 위의 수가 만들어야 하는 수열의 수보다 큼
                if (p != su) {
                    System.out.println("NO");
                    result = false;
                    break;
                } else { // 작음
                    bf.append("-\n"); // StringBuffer에 줄바꿈 추가
                }
            }
        }

        // 출력이 가능하면 보아놨던 StringBuffer의 값을 출력함
        if (result) System.out.println(bf.toString());
	}
}
