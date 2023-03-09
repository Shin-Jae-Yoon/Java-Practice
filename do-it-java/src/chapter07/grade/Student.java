package chapter07.grade;

import java.util.ArrayList;

public class Student {
    private static int serialNum = 1000;
    private int studentID;
    private String studentName;
    private ArrayList<Subject> subjectList;

    // 생성자
    public Student(String studentName) {
        serialNum++;
        studentID = serialNum;
        this.studentName = studentName;
        subjectList = new ArrayList<Subject>();
    }

    // 과목 추가 메서드
    public void addSubject(String name, int score) {
        Subject subject = new Subject();
        subject.setSubjectName(name);
        subject.setSubjectScore(score);
        subjectList.add(subject);
    }

    // 학생 정보 출력 메서드
    public void showStudentInfo() {
        System.out.println("[ 학번 " + studentID + "의 정보입니다. ]");
        int total = 0;
        for (Subject s : subjectList) {
            total += s.getSubjectScore();
            System.out.println("학생 " + studentName + "의 " + s.getSubjectName() + " 과목 성적은 " + s.getSubjectScore() + "입니다.");
        }
        System.out.println("학생 " + studentName + "의 총점은 " + total + " 입니다.");
        System.out.println();
    }
}
