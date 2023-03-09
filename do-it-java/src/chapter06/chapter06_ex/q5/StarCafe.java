package chapter06.chapter06_ex.q5;

public class StarCafe {
    int money;

    public String brewing(int money) {
        this.money += money;
        if (money == Coffee.STARAMERICANO) {
            return "별다방 아메리카노를 구입했습니다.";
        } else if (money == Coffee.STARLATTE) {
            return "별다방 라떼를 구입했습니다.";
        } else {
            return null;
        }
    }
}
