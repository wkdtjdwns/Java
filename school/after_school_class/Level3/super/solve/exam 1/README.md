# 문제

아래의 조건과 `ShopMain.java` 코드를 보고 출력 결과와 똑같이 나오도록 코드를 작성하시오. <br>
(단, 코드의 중복을 최소화 해야 함.)

- Book, Album, Movie 이렇게 3가지 상품을 클래스로 만듦.
- 부모 클래스는 Item이라는 이름을 사용함.
- 공통 속성 : name, price
    - Book: 저자 ( author ), isbn ( isbn )
    - Album: 아티스트 ( artist )
    - Movie: 감독( director ), 배우 ( actor )

---

- **ShopMain.java**
    
    ```java
    package extends1.ex;
    
    public class ShopMain {
    
        public static void main(String[] args) {
            Book book = new Book("JAVA", 10000, "han", "12345");
            Album album = new Album("앨범1", 15000,"seo");
            Movie movie = new Movie("영화1", 18000, "감독1", "배우1");
    
            book.print();
            album.print();
            movie.print();
    
            int sum = book.getPrice() + album.getPrice() + movie.getPrice();
            System.out.println("상품 가격의 합: " + sum);
        }
    }
    
    ```
    
- **실행 결과**
    
    ```
    이름:JAVA, 가격:10000
    - 저자:han, isbn:12345 
    이름:앨범1, 가격:15000
    - 아티스트:seo
    이름:영화1, 가격:18000
    - 감독:감독1, 배우:배우1
    상품 가격의 합: 43000
    ```
