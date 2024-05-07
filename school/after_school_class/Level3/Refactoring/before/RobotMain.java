package magicNumber.before;

public class RobotMain {

    public static void main(String[] args) {

        Robot robot = new Robot("Smith");

        robot.order(0);
        robot.order(1);
        robot.order(2);

        // 이렇게 잘못된 값을 주더라도 코드상으로는 오류가 생기지 않음.
        // 실수가 생길 가능성이 높아짐.
        robot.order(100);
    }
}
