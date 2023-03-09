package chapter06;

public class StudentStaticMethod {
    private static int serialNum = 1000;
    int studentID;
    String studentName;
    int grade;
    String address;

    public StudentStaticMethod() {
        serialNum++;
        studentID = serialNum;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public static int getSerialNum() {
        int i = 10;
        return serialNum;
    }

    public static void setSerialNum(int serialNum) {
        StudentStaticMethod.serialNum = serialNum;
    }
}
