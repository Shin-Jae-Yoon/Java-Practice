package chapter04;

public class pr10_BreakExample1 {
    public static void main(String[] args) {
        int sum = 0;
        int num = 0;

        for (num = 0; sum < 100; num++) {
            sum += num;
        }
        System.out.println("num : " + num);
        System.out.println("sum : " + sum);
    }
}