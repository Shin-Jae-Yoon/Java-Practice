package chapter03;

public class ex01_Q1 {
    public static void main(String[] args) {
        int myAge = 27;
        int teacherAge = 38;

        boolean value = (myAge > 29);
        System.out.println(value);

        System.out.println(myAge <= 29);
        System.out.println(myAge == teacherAge);

        char ch;
        ch = (myAge > teacherAge) ? 'T' : 'F';

        System.out.println(ch);
    }
}
