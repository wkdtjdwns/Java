package poly.ex6;

// 상속과 구현을 동시에 함!
public class Bird extends AbstractAnimal implements Fly {

    @Override
    public void sound() {
        System.out.println("짹짹");
    }

    @Override
    public void fly() {
        System.out.println("참새가 날아간다");
    }
}
