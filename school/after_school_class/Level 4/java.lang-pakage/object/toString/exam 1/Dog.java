package lang.object.tostring;

public class Dog {

    private String dogName;
    private int age;

    public Dog(String dogName, int age) {
        this.dogName = dogName;
        this.age = age;
    }

    @Override
    public String toString() {
        // 해당 클래스의 모든 정보를 알 수 있도록 toString() 메서드를 오버라이딩 함.
        return "Dog{" +
                "dogName= '"+ dogName + '\'' +
                ", age= " + age +
                '}';
    }
}
