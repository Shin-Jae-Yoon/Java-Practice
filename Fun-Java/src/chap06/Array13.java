package chap06;

public class Array13 {
    public static void main(String[] args) {
        ItemForArray[] array = {
                new ItemForArray(500, "사과"),
                new ItemForArray(300, "바나나"),
                new ItemForArray(900, "수박")
        };

        for (ItemForArray i : array) {
            System.out.println(i.getName());
            System.out.println(i.getPrice());
        }
    }
}
