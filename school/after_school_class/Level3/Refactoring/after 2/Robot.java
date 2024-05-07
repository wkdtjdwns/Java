package magicNumber.after2;

public class Robot {

    private String name;

    // 리팩토링의 방법 2. 이너머레이션
    public enum Command {
        WALK,
        STOP,
        JUMP,
    };

    public Robot(String name) {
        this.name = name;
    }

    public void order(Robot.Command command) {

        // 이렇게 사용하면 먼저 보기도 편하고
        // 정수 값을 넘길 수 없어서 오류가 생길 일도 없음.
        if (command == Command.WALK) {
            System.out.println(name + " walk");
        }

        else if (command == Command.STOP) {
            System.out.println(name + " stop");
        }

        else if (command == Command.JUMP) {
            System.out.println(name + " jump");
        }

        else {
            System.out.println(name + " error");
        }
    }
}
