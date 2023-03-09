package chapter05_ex;

public class PersonTest {
    public static void main(String[] args) {
        Person james = new Person();
        james.age = 40;
        james.personName = "James";
        james.isMarried = true;
        james.childrenNum = 3;

        System.out.println("나이 : " + james.age);
        System.out.println("이름 : " + james.personName);
        System.out.println("결혼 여부 : " + james.isMarried);
        System.out.println("자녀 수 : " + james.childrenNum);

        System.out.println();

        Person jaeyoon = new Person(27, "jaeyoon", false, 0);
        System.out.println("나이 : " + jaeyoon.age);
        System.out.println("이름 : " + jaeyoon.personName);
        System.out.println("결혼 여부 : " + jaeyoon.isMarried);
        System.out.println("자녀 수 : " + jaeyoon.childrenNum);
        
    }
}
