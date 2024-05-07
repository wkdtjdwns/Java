package magicNumber.after2;

public class RobotMain {

    public static void main(String[] args) {

        Robot robot = new Robot("Smith");

        robot.order(Robot.Command.WALK);
        robot.order(Robot.Command.STOP);
        robot.order(Robot.Command.JUMP);

        // 이렇게하면 아무리 실수를 하더라도 다른 명령어가 들어가지
        // 오류가 생길 일은 없음.

        // 또한 아래의 코드도 실행이 안 됨.
        // robot.order(100);
    }
}
