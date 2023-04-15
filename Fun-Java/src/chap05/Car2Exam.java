package chap05;

public class Car2Exam {
    public static void main(String[] args) {
        //Car2 c = new Car2("람보르기니");

//        Bus2 b = new Bus2();
//        b.run();
//
//        SportsCar s1 = new SportsCar("스포츠카");
//        s1.run();

        // 아래와 같은 코드일 때 어떤 결과가 나올까?
         Car2 c = new Bus2();
         c.run();

        // Car2를 2개 참조할 수 있는 배열을 선언
        // 자동차의 배열 = 자동차의 후손들을 참조할 수 있는 배열
        // 오브젝트 배열 = 모든 객체를 참조할 수 있는 배열
        // 일반화시켜서 여러가지 것들을 마치 하나의 종류인 것처럼 다룰 수 있다. 추상클래스와 배열을 사용하면 편리하게 다룰 수 있음!
        Car2[] array = new Car2[2];
        array[0] = new Bus2();
        array[1] = new SportsCar("스포츠카");
        for (Car2 c2 : array) {
            c2.run();
        }
    }
}
