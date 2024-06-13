package lang.object.test;

import java.util.Objects;

public class Rectangle {

    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "가로=" + width +
                ", 세로=" + height +
                '}';
    }

    // equals() 메서드 구현 시 지킬 규칙 구현
    @Override
    public boolean equals(Object o) {
        // 자신이 파라미터로 오는 값과 같으면 true
        if (this == o) return true;

        // 파라미터 값이 null이거나 getClass()의 값이 다르면 false
        if (o == null || getClass() != o.getClass()) return false;

        // Rectangle로 다운 캐스팅해서 각 멤버 변수의 값을 비교해서 값을 출력함. (동등성 비교)
        Rectangle rectangle = (Rectangle) o;
        return width == rectangle.width && height == rectangle.height;
    }
}
