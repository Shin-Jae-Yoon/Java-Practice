package chap08.enumtype;

public class DaySwitchTest {
    public static void main(String[] args) {
        Day day = Day.SUNDAY;

        switch (day) {
            case SUNDAY:
                System.out.println("일요일 입니다.");
                break;
            case MONDAY:
                System.out.println("월요일 입니다.");
                break;
            default:
                System.out.println("그 밖의 요일");
        }
    }
}
