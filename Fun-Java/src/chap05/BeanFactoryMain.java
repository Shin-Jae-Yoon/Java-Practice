package chap05;

public class BeanFactoryMain {
    public static void main(String[] args) {
        BeanFactory bf1 = BeanFactory.getInstance();
        BeanFactory bf2 = BeanFactory.getInstance();
        if (bf1 == bf2) {
            System.out.println("bf1 == bf2");
        }

        Bus b1 = bf1.getBus();
        Bus b2 = bf1.getBus();

        // Bus b3 = new Bus();
        // 원래는 이렇게 객체 생성을 직접 했는데
        // 위와 같이 BeanFactory에 객체 생성을 맡겨서 하는 것을 볼 수 있음
        // 객체 생성을 대신 해주는 곳을 팩토리라고 함
    }
}
