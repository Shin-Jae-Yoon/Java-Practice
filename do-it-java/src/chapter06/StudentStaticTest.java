package chapter06;

public class StudentStaticTest {
    public static void main(String[] args) {
        StudentStatic studentLee = new StudentStatic();
        studentLee.setStudentName("이지원");
        System.out.println(studentLee.serialNum);
        System.out.println(studentLee.studentName + " 학번 : " + studentLee.studentID);

        StudentStatic studentSon = new StudentStatic();
        studentSon.setStudentName("손수경");
        System.out.println(studentSon.serialNum);
        System.out.println(studentSon.studentName + " 학번 : " + studentSon.studentID);
    }
}
