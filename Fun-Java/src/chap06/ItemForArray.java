package chap06;

// 불변 객체
public class ItemForArray {
    private int price;
    private String name;

    public ItemForArray(int price, String name) {
        this.price = price;
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}
