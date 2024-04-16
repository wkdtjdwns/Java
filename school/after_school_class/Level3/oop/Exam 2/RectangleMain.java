package oop_exam;

public class RectangleMain {

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle();

        rectangle.width = 5;
        rectangle.length = 8;

        int area = rectangle.calculateArea();
        int round = rectangle.calculateRound();
        boolean isSquae = rectangle.isSquare();

        System.out.println("넓이: " + area);
        System.out.println("둘레 길이: " + round);
        System.out.println("정사각형 여부: " + isSquae);
    }
}
