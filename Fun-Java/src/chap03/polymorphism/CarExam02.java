package chap03.polymorphism;

public class CarExam02 {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.printName();
        System.out.println("----------------------");
        Car c2 = new Car("람보르기니");
        c2.printName();
    }
}
