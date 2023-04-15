package chap05.interfaceExam;

public class LottoMachineMain {
    public static void main(String[] args) {

        // Ball b1 = new Ball(1);
        // 변수가 45개나 필요하다.
        // 같은 타입의 변수가 여러 개 필요하면 그때 배열을 사용하면 유용하다.

        // 착각하면 안되는게, 위에꺼는 인스턴스 45개를 만든건데
        // 배열은 Ball 인스턴스를 45개 참조할 수 있는 배열이 만들어진거다.
        // 즉 방이 45개가 있는거고, 각각의 방이 인스턴스를 참조할 수 있는 변수이다.
        Ball[] balls = new Ball[LottoMachine.MAX_BALL_COUNT];

        // 근데 또 이런식으로 45개 언제 적냐? 반복문 쓰자.
        // balls[0] = new Ball(1);
        for (int i = 0; i < LottoMachine.MAX_BALL_COUNT; i++) {
            balls[i] = new Ball(i + 1);
        }



        // 인터페이스도 참조하는 레퍼런스 타입은 가능하다.
        // LottoMachine 인스턴스가 생성된다.
        LottoMachine lottoMachine = new LottoMachineImpl();
        lottoMachine.setBalls(balls);
        lottoMachine.mix();
        Ball[] result = lottoMachine.getBalls();

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i].getNumber());
        }
    }
}
