package chap03.polymorphism;

public class CarExam01 {
    public static void main(String[] args) {
        Bus b1 = new Bus();
        b1.run();

        Car c1 = new Bus();
        c1.run();

        Bus b2 = (Bus)c1;
        b2.안내방송();
    }
}
