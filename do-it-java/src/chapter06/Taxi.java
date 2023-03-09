package chapter06;

public class Taxi {
    int money;

//    public Taxi(int money) {
//        this.money = money;
//    }

    public void take(int money) {
        this.money += money;
    }

    public void showInfo() {
        System.out.println("택시 기사님은 " + money + "원을 지불 받았습니다.");
    }
}
