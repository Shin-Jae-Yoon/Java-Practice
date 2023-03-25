package chap03.polymorphism;

class Parents {
    public int i = 5;
    public void printI() {
        System.out.println("parent - printI() : " + i);
    }

    public void printII() {
        System.out.println("parent - printII() : " + i * 2);
    }
}

class Child extends Parents {
    public int i = 15; // 필드에 대한 오버라이딩
    public void printI() { // 메서드에 대한 오버라이딩
        System.out.println("child - printI() : " + i);
    }
}

public class Exam01 {
    public static void main(String[] args) {
        Parents p1 = new Parents();
        System.out.println(p1.i);
        p1.printI();
        System.out.println("------------------------");
        Child c1 = new Child();
        System.out.println(c1.i);
        c1.printI();
        System.out.println("------------------------");
        Parents p2 = new Child();   // Child는 Parent의 후손이다.
        System.out.println(p2.i);
        p2.printII();
        p2.printI();
    }
}
