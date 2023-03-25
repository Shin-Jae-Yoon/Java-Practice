package chap01;

public class CharExam01 {
    public static void main(String[] args) {
        char c1 = 'a';
        System.out.println((int)c1);
        char c2 = (char)97;
        System.out.println(c2);

        char c3 = 'A';
        while (c3 <= 'Z') {
            System.out.println(c3);
            c3++;
        }
    }
}
