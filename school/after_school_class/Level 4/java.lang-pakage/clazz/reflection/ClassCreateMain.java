package lang.clazz;

public class ClassCreateMain {

    public static void main(String[] args) throws Exception {
        Class helloClass = Class.forName("lang.clazz.Hello");

        // getDeclaredConstructor(): 생성자를 선택함.
        // newInstance(): 선택된 생성자를 기반으로 인스턴스를 생성함.
        Hello hello = (Hello) helloClass.getDeclaredConstructor().newInstance();
        String result = hello.hello();

        System.out.println("result = " + result);

        Hello hello1 = new Hello();
        System.out.println(hello1.hello());
    }
}
