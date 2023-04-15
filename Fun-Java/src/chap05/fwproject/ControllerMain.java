package chap05.fwproject;

import chap05.fw.Controller;

public class ControllerMain {
    public static void main(String[] args) {
        Controller c1 = new FirstController();
        c1.execute();

        // 근데 만약에 c1.init()만 한다면?
        // 초기화 하는 코드만 뜨겠지. 이건 우리가 원하는게 아님
        // 그래서 init()과 close()는 사용자가 못쓰게 막아야함.

    }
}
