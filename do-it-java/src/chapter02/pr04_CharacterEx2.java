package chapter02;

public class pr04_CharacterEx2 {
    public static void main(String[] args) {
        char ch1 = '한';
        char ch2 = '\uD55C'; // '한'의 unicode 값
        // D, 5, 5, C 16진수 숫자 하나가 4비트니까
        // 4비트 4개, 16비트 = 2바이트

        System.out.println(ch1);
        System.out.println(ch2);
    }
}
