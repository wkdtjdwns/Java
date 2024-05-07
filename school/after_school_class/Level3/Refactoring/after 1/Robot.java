package magicNumber.after;

public class Robot {

    private String name;

    // 필요한 명령어의 상수화
    public static final int COMMAND_WALK = 0;
    public static final int COMMAND_STOP = 1;
    public static final int COMMAND_JUMP = 2;

    public Robot(String name) {
        this.name = name;
    }

    public void order(int command) {

        // 리팩토링의 방법 1. 상수 사용
        // 수학 시간에 원의 넓이를 구할 때 3.14를 직접 쓰는 것이 아닌 pi기호를 쓰는 것 처럼
        // 0, 1, 2라는 코드를 상수화 시켜서 관리함.

        // 이렇게하면 적어도 어떤 명령어를 실행할 것인지는 쉽게 알 수 있음.
        if (command == COMMAND_WALK) {
            System.out.println(name + " walk");
        }

        else if (command == COMMAND_STOP) {
            System.out.println(name + " stop");
        }

        else if (command == COMMAND_JUMP) {
            System.out.println(name + " jump");
        }

        else {
            System.out.println(name + " error");
        }
    }
}
