package classExam;

public class Person {
    public final String name;

    public Person(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        // final Person p1 = new Person("홍길동"); 이런 식으로 인스턴스화 할 때 final을 사용하면 안 됨
        Person p1 = new Person("홍길동");
        // p1.name = "장발장"; 상수의 값은 바꿀 수 없음
        System.out.println(p1.name);
    }
}
