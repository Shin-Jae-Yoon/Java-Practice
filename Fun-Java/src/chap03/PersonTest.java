package chap03;

public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person();

        p1.name = "홍길동";
        p1.address = "부산";
        p1.isVip = true;
        p2.name = "조조";
        p2.address = "김해";

        System.out.println(p1.name);
        System.out.println(p1.address);
        System.out.println(p1.isVip);

        System.out.println(p2.name);
        System.out.println(p2.address);
        System.out.println(p2.isVip);
    }
}
