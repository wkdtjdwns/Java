package poly.ex4;

public class Cow implements InterfaceAnimal {

    @Override
    public void sound() {
        System.out.println("음머");
    }

    @Override
    public void move() {
        System.out.println("소 이동");
    }
}
