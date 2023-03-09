package chapter05_ex;

public class MyDate {
    private int year;
    private int month;
    private int day;

    public int getYear() {
        return year;
    }

    public void setYear(int year) { this.year = year; }

    public int getMonth() { return month; }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public boolean isValid() {
        if (month < 1 || month > 12) {
            System.out.println("유효하지 않은 날짜입니다.");
            return false;
        } else if (day < 1 || day > 31) {
            System.out.println("유효하지 않은 날짜입니다.");
            return false;
        } else if (month == 2 && day > 28) {
            System.out.println("유효하지 않은 날짜입니다.");
            return false;
        } else {
            System.out.println("유효한 날짜입니다.");
            return true;
        }
    }
}
