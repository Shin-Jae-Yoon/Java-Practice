package chapter06.chapter06_ex.q6;

public class Test {
    public static void main(String[] args) {
        Company company = Company.getInstance();
        Person james = new Person();
        james.setPersonName("james");
        Person son = new Person();
        son.setPersonName("son");

        System.out.println(james.getPersonName() + "가 발급받은 카드 번호는 " + company.createCard().getCardNum() + "입니다.");
        System.out.println(son.getPersonName() + "가 발급받은 카드 번호는 " + company.createCard().getCardNum() + "입니다.");
    }
}
