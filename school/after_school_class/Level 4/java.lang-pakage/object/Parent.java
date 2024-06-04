package lang.object;

// public class Parent extends Object { // 아래와 똑같은 코드임
public class Parent {

    public void parentMethod() {
        System.out.println("parent.parentMethod");
    }
}

/*
클래스에 상속 받을 부모 클래스가 없으면 묵시적으로 Object 클래스를 상속 받음.
- 자바가 extends Object 코드를 넣어주는 것임.
- extends Object는 생략하는 것을 권장함.
 */
