package chap09;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class HelloIO08 {
    public static void main(String[] args) throws Exception {
        // 이름, 국어, 영어, 수학, 총점, 평균 점수를 /Users/jaeyoon/Desktop/score.dat 파일에서 읽기
        DataInputStream in = new DataInputStream(new FileInputStream("/Users/jaeyoon/Desktop/score.dat"));
        printStudent(in);
        printStudent(in);
        in.close();
    }

    private static void printStudent(DataInputStream in) throws IOException {
        String name = in.readUTF();
        int kor = in.readInt();
        int eng = in.readInt();
        int math = in.readInt();
        double total = in.readDouble();
        double avg = in.readDouble();

        System.out.println(name);
        System.out.println(kor);
        System.out.println(eng);
        System.out.println(math);
        System.out.println(total);
        System.out.println(avg);
    }
}
