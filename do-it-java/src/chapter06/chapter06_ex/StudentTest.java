package chapter06.chapter06_ex;

public class StudentTest {
    public static void main(String[] args) {
        Student studentLee = new Student();
        studentLee.setStudentName("이지원");

        System.out.println("[학생] " + studentLee.getStudentName());
        System.out.println("학번 : " + Student.getSerialNum());
        System.out.println("카드번호 : " + Student.getCardNum());
        System.out.println();

        Student studentSon = new Student();
        studentSon.setStudentName("손수경");

        System.out.println("[학생] " + studentSon.getStudentName());
        System.out.println("학번 : " + Student.getSerialNum());
        System.out.println("카드번호 : " + Student.getCardNum());
    }
}
