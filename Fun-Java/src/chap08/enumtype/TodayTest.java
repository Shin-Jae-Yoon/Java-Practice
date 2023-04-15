package chap08.enumtype;

public class TodayTest {
    public static void main(String[] args) {
        Today today = new Today();
        today.setDay(Day.SATURDAY);
        System.out.println(today.getDay());
    }
}
