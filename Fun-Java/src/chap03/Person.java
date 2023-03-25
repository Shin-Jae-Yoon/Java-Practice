package chap03;

public class Person {
    String name;    // 인스턴스 필드
    String address;
    boolean isVip;
    static int count;   // 클래스 필드
    static {    //  클래스 필드는 static 블록에서 초기화 가능
        count = 100;
    }

    public void printName() {   // 인스턴스 메서드
        System.out.println("내 이름은 " + name);
    }

    public static void printCount() {   // 클래스 메서드
        System.out.println("count : " + count);
    }
}
