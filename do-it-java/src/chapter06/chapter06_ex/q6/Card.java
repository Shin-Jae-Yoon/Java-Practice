package chapter06.chapter06_ex.q6;

public class Card {
    private static int serialNum = 0;
    private int cardNum;

    public Card() {
        serialNum++;
        cardNum = serialNum;
        System.out.println("카드 발급이 완료되었습니다.");
    }

    public int getCardNum() {
        return cardNum;
    }

    public void setCardNum(int cardNum) {
        this.cardNum = cardNum;
    }
}
