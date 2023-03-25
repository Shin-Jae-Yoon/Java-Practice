package chap03.book;

class Book {
    private int price; // field price

    // 필드의 값을 수정하고 얻기 위한 메서드 getter, setter
    public int getPrice() {
        return price;   // this는 내 자신 인스턴스를 참조하는 예약어
    }

    public void setPrice(int price) {   // 지역변수 price
        // 매개변수로 받은 지역변수 price로
        // 내 자신 인스턴스를 참조하는 this.price를 초기화
        this.price = price;
    }
}

public class BookExam01 {
    public static void main(String[] args) {
        Book b1 = new Book();
        b1.setPrice(500);
        System.out.println(b1.getPrice());
    }
}
