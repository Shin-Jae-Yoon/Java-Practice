package chap05.fw;

/**
 * 프로그래밍을 작성하는데, 어떤 기능들이 있다.
 * 이 기능들은 항상
 * 1. 초기화 과정
 * 2. 실행 과정
 * 3. 마무리 과정
 * 순서로 프로그램을 짠다고 해보자.
 * 그런데, 아래와 같이 컨트롤러가 있는데, 컨트롤러의 종류가 여러 개이고
 * 초기화와 마무리는 코드가 같은데 실행만 다른 코드라고 하자.
 * 그래서 컨트롤러를 상속받자고 만들게 되었다.
 */

public abstract class Controller {
//    public void init() {
//        System.out.println("초기화 하는 코드");
//    }

    // protected는 같은 package이거나 상속받았을 경우에만 접근 가능
    protected final void init() {
        System.out.println("초기화 하는 코드");
    }

//    public void close() {
//        System.out.println("마무리 하는 코드");
//    }

    protected final void close() {
        System.out.println("마무리 하는 코드");
    }

    public abstract void run(); // 매번 달라지는 코드

    // 내가 가지고 있는 메서드를 호출한다.
    // 어떤 순서를 가지고 있다.
    // 이런 정해진 순서대로 실행하도록 만든 메서드를 템플릿 메서드라고 한다.
    public void execute() {
        // 초기화
        this.init();    // this. 생략 가능
        // 실행
        this.run();
        // 마무리
        this.close();
    }
}
