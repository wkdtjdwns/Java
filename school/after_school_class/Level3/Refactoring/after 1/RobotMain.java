package magicNumber.after;

public class RobotMain {

    public static void main(String[] args) {

        Robot robot = new Robot("Smith");

        robot.order(Robot.COMMAND_WALK);
        robot.order(Robot.COMMAND_STOP);
        robot.order(Robot.COMMAND_JUMP);

        // 이렇게하면 아무리 실수를 하더라도 다른 명령어가 들어가지
        // 오류가 생길 일은 없음.

        // 하지만 아래의 코드는 여전히 실행이 됨.
        robot.order(100);
    }
}
