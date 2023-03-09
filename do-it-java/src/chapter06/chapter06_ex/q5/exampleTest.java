package chapter06.chapter06_ex.q5;

public class exampleTest {
    public static void main(String[] args) {
        Person james = new Person("james", 10000);

        james.buyStarCoffee(james.goStarCafe(), 4000);
        james.buyBeanCoffee(james.goBeanCafe(), 4500);
    }
}
