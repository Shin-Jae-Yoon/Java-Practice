package chap05.interfaceExam;

/*
1. 1~45까지 번호가 있는 Ball을 로또 기계에 넣는다.
2. 로또 기계에 있는 Ball들을 섞는다.
3. 섞인 Ball 중 6개를 꺼낸다.
 */

// 인터페이스 또한 추상 클래스처럼 인스턴스화 할 수 없다.
public interface LottoMachine {
    // 사실은 모든 필드는 public static을 붙여야한다.
    // 하지만 인터페이스의 모든 필드는 public static이니까 생략할 수 있다.
    // public static 하다는건 메모리에 인스턴스가 올라가지 않아도 사용할 수 있다는 것
    // 따라서. LottoMachine.MAX_BALL_COUNT가 된다는 말
    int MAX_BALL_COUNT = 45;
    int RETURN_BALL_COUNT = 7;

    // 사실은 모두 abstract를 붙여야 하는데, 인터페이스가 가지는 메서드 자체가
    // 추상 메서드이기 때문에 abstract를 생략할 수 있다.
    public void setBalls(Ball[] balls); // Ball[]은 Ball 여러 개를 받겠다. 45개를 받는다.
    public void mix();  // 자기가 가지고 있는 Ball들을 섞는다.
    public Ball[] getBalls();   // 6개의 Ball을 반환한다.
}
