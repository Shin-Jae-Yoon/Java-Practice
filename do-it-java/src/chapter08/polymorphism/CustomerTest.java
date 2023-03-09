package chapter08.polymorphism;

public class CustomerTest {
    public static void main(String[] args) {
        Customer customerLee = new Customer(10010, "이순신");
        customerLee.bonusPoint = 1000;
        System.out.println(customerLee.showCustomerInfo());

        Customer customerKim = new VIPCustomer(10020, "김유신", 12345);
        customerKim.bonusPoint = 10000;
        System.out.println(customerKim.showCustomerInfo());

        Customer customerShin = new GoldCustomer(10030, "신재윤");
        customerShin.bonusPoint = 5000;
        System.out.println(customerShin.showCustomerInfo());

        System.out.println("===== 할인율과 보너스 포인트 계산 =====");

        int price = 10000;
        int leePrice = customerLee.calcPrice(price);
        int kimPrice = customerKim.calcPrice(price);
        int shinPrice = customerShin.calcPrice(price);

        System.out.println(customerLee.getCustomerName() + "님이 " + leePrice + "원 지불하셨습니다.");
        System.out.println(customerLee.showCustomerInfo());
        System.out.println(customerKim.getCustomerName() + "님이 " + kimPrice + "원 지불하셨습니다.");
        System.out.println(customerKim.showCustomerInfo());
        System.out.println(customerShin.getCustomerName() + "님이 " + shinPrice + "원 지불하였습니다.");
        System.out.println(customerShin.showCustomerInfo());
    }
}
