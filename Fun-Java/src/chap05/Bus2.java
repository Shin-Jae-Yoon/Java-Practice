package chap05;

public class Bus2 extends Car2 {
    public Bus2() {
        super("Bus!!");
        System.out.println("Bus2 기본 생성자");
    }

    // 부모가 가지고 있는 추상메서드는 자식에서 반드시 구현해야함
    @Override
    public void run() {
        System.out.println("후륜구동으로 동작한다.");
    }
}
