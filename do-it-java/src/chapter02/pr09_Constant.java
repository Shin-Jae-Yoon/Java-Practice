package chapter02;

public class pr09_Constant {
    public static void main(String[] args) {
        final int MAX_NUM = 100;
        final int MIN_NUM;

        MIN_NUM = 0; // 사용하기 전에 초기화 한 것, 초기화 안하면 오류 발생

        System.out.println(MAX_NUM);
        System.out.println(MIN_NUM);
    }
}
