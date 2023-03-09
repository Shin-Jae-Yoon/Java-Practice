package chapter06.chapter06_ex.q5;

public class Person {
    String personName;
    int personMoney;

    public Person() {
        this("이름 없음", 0);
    }

    public Person(String personName, int personMoney) {
        this.personName = personName;
        this.personMoney = personMoney;
    }

    public StarCafe goStarCafe() {
        return new StarCafe();
    }

    public BeanCafe goBeanCafe() {
        return new BeanCafe();
    }

    public void buyStarCoffee(StarCafe star, int personMoney) {
        String message = star.brewing(4000);
        if (message != null) {
            this.personMoney -= personMoney;
            System.out.println(personName + "가 " + personMoney + "원을 내고 " + message);
        }
    }

    public void buyBeanCoffee(BeanCafe bean, int personMoney) {
        String message = bean.brewing(4500);
        if (message != null) {
            this.personMoney -= personMoney;
            System.out.println(personName + "가 " + personMoney + "원을 내고 " + message);
        }
    }
}
