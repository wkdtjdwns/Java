package enumeration.test.ex1;

public class AuthMain {

    public static void main(String[] args) {

        AuthGrade[] authGrades = AuthGrade.values();
        for (AuthGrade authGrade : authGrades) {
            authGrade.printAuthGrade();
        }
    }
}
