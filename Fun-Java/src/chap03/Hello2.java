package chap03;

public class Hello2 {
    static int i;
    static {
        i = 500;
        System.out.println("static block"); // static 필드를 초기화
    }
    public static void main(String[] args) {
        System.out.println("Hello");
    }
}