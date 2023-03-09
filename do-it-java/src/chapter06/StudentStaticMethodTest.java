package chapter06;

public class StudentStaticMethodTest {
    public static void main(String[] args) {
        StudentStaticMethod studentLee = new StudentStaticMethod();
        studentLee.setStudentName("이지원");
        System.out.println(StudentStaticMethod.getSerialNum());
        System.out.println(studentLee.studentName + " 학번 : " + studentLee.studentID);

        StudentStaticMethod studentSon = new StudentStaticMethod();
        studentSon.setStudentName("손수경");
        System.out.println(StudentStaticMethod.getSerialNum());
        System.out.println(studentSon.studentName + " 학번 : " + studentSon.studentID);
    }
}
