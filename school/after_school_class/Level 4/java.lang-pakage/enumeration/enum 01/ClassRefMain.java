package enumeration.ex2;

public class ClassRefMain {

    public static void main(String[] args) {
        
        System.out.println("Class BASIC = " + ClassGrade.BASIC.getClass());
        System.out.println("Class GOLD = " + ClassGrade.GOLD.getClass());
        System.out.println("Class DIAMOND = " + ClassGrade.DIAMOND.getClass());
        // Class BASIC = class enumeration.ex2.ClassGrade
        // Class GOLD = class enumeration.ex2.ClassGrade
        // Class DIAMOND = class enumeration.ex2.ClassGrade
        
        
        System.out.println("ref Basic = " + ClassGrade.BASIC);
        System.out.println("ref GOLD = " + ClassGrade.GOLD);
        System.out.println("ref DIAMOND = " + ClassGrade.DIAMOND);
        // ref Basic = enumeration.ex2.ClassGrade@4e50df2e
        // ref GOLD = enumeration.ex2.ClassGrade@1d81eb93
        // ref DIAMOND = enumeration.ex2.ClassGrade@7291c18f
    }
}

/*
- 위의 코드에서  ClassGrade들은  static이므로 애플리케이션 로딩 시점에 3개의 ClassGrade 인스턴스가 생성됨.
- 각각의 상수는 ClassGrade 타입의 서로 다른 인스턴스의 참조값을 가짐.
*/
