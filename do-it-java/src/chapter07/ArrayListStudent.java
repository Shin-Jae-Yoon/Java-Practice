package chapter07;
import java.util.ArrayList;

public class ArrayListStudent {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<Student>();

        list.add(new Student(1001, "James"));
        list.add(new Student(1002, "Tomas"));
        list.add(new Student(1003, "Edward"));

        System.out.println("=== 기존의 for문 ===");
        for (int i = 0; i < list.size(); i++) {
            Student student = list.get(i);
            student.showStudentInfo();
        }

        System.out.println();

        System.out.println("=== 향상된 for문 ===");
        for (Student student : list) {
            student.showStudentInfo();
        }
    }
}
