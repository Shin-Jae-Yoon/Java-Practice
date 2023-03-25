package chap01;

public class WhileExam1 {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 10) {
            if (i == 3) break;
            System.out.println(i);
            i++;
        }
    }
}
