package chapter08.override;

public class OverridingTest {
    public static void main(String[] args) {
        Customer vc = new VIPCustomer(10030, "나몰라", 2000);
        vc.bonusPoint = 1000;

        System.out.println(vc.getCustomerName() + " 님이 지불해야하는 금액은 " + vc.calcPrice(10000) + "원입니다.");
    }
}
