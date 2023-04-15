package chap05;

public class CarExam {
    public static void main(String[] args) {
        // Car를 상속받고 있기는 한데 클래스를 만들고싶지 않다.
        // Car를 상속받고 있는 이름없는 객체를 만들었다.
        Car car = new Car(){
            @Override
            public void a() {
                System.out.println("이름없는 객체의 a() 메서드 오버라이딩");
            }
        };

        car.a();

        Bus b1 = new Bus() {
            @Override
            public void a() {
                System.out.println("꺄로롱");
            }
        };

        b1.a();

    }
}
