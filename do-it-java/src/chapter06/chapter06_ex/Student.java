package chapter06.chapter06_ex;

public class Student {
    private static int cardNum;
    private static int serialNum = 999;
    private int studentID;
    private String studentName;

    public Student() {
        serialNum++;
        this.studentID = serialNum;
        cardNum = studentID + 100;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public static int getSerialNum() {
        return Student.serialNum;
    }

    public static void setSerialNum(int serialNum) {
        Student.serialNum = serialNum;
    }

    public static int getCardNum() {
        return Student.cardNum;
    }

    public static void setCardNum(int cardNum) {
        Student.cardNum = cardNum;
    }
}
