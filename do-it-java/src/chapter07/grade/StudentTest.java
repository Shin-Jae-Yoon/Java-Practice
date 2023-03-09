package chapter07.grade;

public class StudentTest {
    public static void main(String[] args) {
        Student lee = new Student("Lee");
        Student kim = new Student("Kim");
        lee.addSubject("국어", 100);
        lee.addSubject("수학", 50);
        kim.addSubject("국어", 70);
        kim.addSubject("수학", 85);
        kim.addSubject("영어", 100);

        lee.showStudentInfo();
        kim.showStudentInfo();
    }
}
