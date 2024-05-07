package magicNumber.before;

public class Robot {

    private String name;

    public Robot(String name) {
        this.name = name;
    }

    public void order(int command) {

        // 이런 식으로 사용하면 숫자로 명령을 주어야 하는데,
        // 명령을 줄 때 0이 무슨 명령인지, 1은 또 뭔지 알 수가 없음.
        // 또한 이 코드를 읽을 때에도 읽기가 불편함.
        // 그래서 아래와 같이 어떤 명령어인지 주석을 달아주어야 하며
        // 100개의 명령어를 사용한다면 본인이 사용하기도 불편함.
        if (command == 0) { // 걷기
            System.out.println(name + " walk");
        }

        else if (command == 1) { // 멈추기
            System.out.println(name + " stop");
        }

        else if (command == 2) { // 점프
            System.out.println(name + " jump");
        }

        else {
            System.out.println(name + " error");
        }
    }
}
