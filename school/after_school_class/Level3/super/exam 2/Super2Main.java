package extends1.super2;

public class Super2Main {

    public static void main(String[] args) {

        ClassC classC = new ClassC();

        // ClassA 생성자 // B에서 A의 생성자가 호출됨.
        // ClassB 생성자 a = 10, b = 20 // C에서 B의 생성자가 호출됨.
        // ClassC 생성자 // C에서 자신의 생성자가 호출됨.

        ClassB classB = new ClassB(5);
        
        // ClassA 생성자 // super()가 정상적으로 작동함.
        // ClassB 생성자 a = 5, b = 0 // 2번째 생성자가 실행됨. 
    }
}

/*
1. 상속 관계의 생성자 호출은 결과적으로 부모에서 자식 순서로 진행됨. 따라서 부모의 데이터를 먼저 초기화하고,
    그 다음에 자식의 데이터를 초기화함.
2. 상속 관계에서 자식 클래스의 생성자 첫 줄에 반드시 super(...)를 호출해야 함.
    단, 기본 생성자 ( super() )인 경우에는 생략할 수 있음.
*/
