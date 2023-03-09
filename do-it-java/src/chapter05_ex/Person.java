package chapter05_ex;

public class Person {
    int age;
    String personName;
    boolean isMarried;
    int childrenNum;

    public Person() {};

    public Person(int age, String personName, boolean isMarried, int childrenNum) {
        this.age = age;
        this.personName = personName;
        this.isMarried = isMarried;
        this.childrenNum = childrenNum;
    }
}
