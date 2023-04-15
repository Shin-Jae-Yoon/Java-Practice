package chap09;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class HelloIO07 {
    public static void main(String[] args) throws Exception {
        // 이름, 국어, 영어, 수학, 총점, 평균 점수를 /Users/jaeyoon/Desktop/score.dat 파일에 저장
        String name = "kim";
        int kor = 90;
        int eng = 50;
        int math = 70;
        double total = kor + eng + math;
        double avg = total / 3.0;

        DataOutputStream out = new DataOutputStream(new FileOutputStream("/Users/jaeyoon/Desktop/score.dat"));
        out.writeUTF(name);
        out.writeInt(kor);
        out.writeInt(eng);
        out.writeInt(math);
        out.writeDouble(total);
        out.writeDouble(avg);

        out.writeUTF(name);
        out.writeInt(kor);
        out.writeInt(eng);
        out.writeInt(math);
        out.writeDouble(total);
        out.writeDouble(avg);
        out.close();
    }
}
