package chap08;

/**
 * 책 한 권의 정보를 담기 위한 클래스
 *
 * @author jaeyoon(<a href="mailto:wlwhsvkdlxh@gmail.com">신재윤</a>
 * @since 2023.03
 * @version 0.1
 *
 */

public class Book {
    /*
        title
        price를 필드로 선언하였습니다.
     */
    private String title;
    private int price;  // 필드 price

    /*
        필드의 값을 수정하고 얻기 위한 메서드 getter, setter를 만든다.
        setter, getter - 프로퍼티(property) - price 프로퍼티
     */

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) { // 지역변수 price
        this.price = price;
    }
}