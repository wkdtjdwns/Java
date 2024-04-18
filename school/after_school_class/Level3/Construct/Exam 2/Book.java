package construct;

public class Book {

    String title;
    String author;
    int page;

    // 기본 생성자 생성 (생성자를 만들 것이기 때문)
    Book() {

        // 메소드 오버로딩 사용
        this("", "",0);
    }

    Book(String title, String author) {

        // 메소드 오버로딩 사용
        this(title, author,0);
    }

    Book(String title, String author, int page) {
        this.title = title;
        this.author = author;
        this.page = page;
    }

    void displayinfo() {
        System.out.printf("제목: %s, 저자: %s, 페이지: %d \n", this.title, this.author, this.page);
    }
}
