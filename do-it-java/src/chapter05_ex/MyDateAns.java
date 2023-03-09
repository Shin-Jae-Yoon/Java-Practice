package chapter05_ex;

import java.util.Calendar;

public class MyDateAns {
    private int year;
    private int month;
    private int day;
    private boolean isValid = true;

    public MyDateAns(int year, int month, int day) {
        setYear(year);
        setMonth(month);
        setDay(day);
    }

    public int getYear() {
        return year;
    }
    // year > Calendar.getInstance().get(Calendar.YEAR)

    public void setYear(int year) {
        if (year > Calendar.getInstance().get(Calendar.YEAR)) {
            isValid = false;
        } else {
            this.year = year;
        }
    }

    public int getMonth() {
        return year;
    }

    public void setMonth(int month) {
        if (month > Calendar.getInstance().get(Calendar.MONTH)) {
            isValid = false;
        } else {
            this.month = month;
        }
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                if (day < 0 || day > 31) {
                    isValid = false;
                } else {
                    this.day = day;
                }
                break;
            case 4: case 6: case 9: case 11:
                if (day < 0 || day > 30) {
                    isValid = false;
                } else {
                    this.day = day;
                }
                break;
            case 2:
                if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
                    if (day < 0 || day > 29) {
                        isValid = false;
                    } else {
                        this.day = day;
                    }
                } else {
                    if (day < 0 || day > 30) {
                        isValid = false;
                    } else {
                        this.day = day;
                    }
                }
                break;
            default:
                isValid = false;
                break;
        }
    }

    public String isValid() {
        if (isValid == false) {
            return "유효하지 않은 날짜입니다.";
        } else {
            return "유효한 날짜입니다.";
        }
    }
}
