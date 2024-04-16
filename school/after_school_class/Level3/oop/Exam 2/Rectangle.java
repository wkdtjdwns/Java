package oop_exam;

public class Rectangle {

    int width;
    int length;

    int calculateRound() {

        return (width * 2) + (length * 2);
    }

    int calculateArea() {
        return width * length;
    }

    boolean isSquare() {

        if (width == length)
            return true;
        else
            return false;
    }
}
