package chapter06.chapter06_ex.q5;

public class BeanCafe {
    int money;

    public String brewing(int money) {
        this.money += money;
        if (money == Coffee.BEANAMERICANO) {
            return "콩다방 아메리카노를 구입했습니다.";
        } else if (money == Coffee.BEANLATTE) {
            return "콩다방 라떼를 구입했습니다.";
        } else {
            return null;
        }
    }
}
