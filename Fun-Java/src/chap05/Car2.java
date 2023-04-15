package chap05;

public abstract class Car2 {
    public Car2(String name) {
        super();
        System.out.println("Car2() 생성자 호출");
    }

    // 추상 메서드
    // Car2 클래스를 만든 사람은 run()이라는 메서드가 필요하다고 생각함
    // run()의 구현은 자동차마다 다를 것 같다고 생각\
    public abstract void run();
}
