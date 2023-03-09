package chapter05_ex;

public class MyDateTest {
    public static void main(String[] args) {
        MyDate date1 = new MyDate(2022, 10, 5);
        System.out.println(date1.isValid());
        MyDate date2 = new MyDate(2006, 2, 31);
        System.out.println(date2.isValid());
        MyDate date3 = new MyDate(2018, 2, 28);
        System.out.println(date3.isValid());
    }
}
