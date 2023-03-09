package chapter04;

public class ex01_Q1 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 2;
        char operator = '/';

        // if-else
        if (operator == '+') {
            System.out.println(num1 + num2);
        } else if (operator == '-') {
            System.out.println(num1 - num2);
        } else if (operator == '*') {
            System.out.println(num1 * num2);
        } else if (operator == '/') {
            System.out.println(num1 / num2);
        }

        // switch-case

        switch (operator) {
            case '+' :
                System.out.println(num1 + num2);
                break;
            case '-' :
                System.out.println(num1 - num2);
                break;
            case '*' :
                System.out.println(num1 * num2);
                break;
            case '/' :
                System.out.println(num1 / num2);
                break;
        }
    }
}
