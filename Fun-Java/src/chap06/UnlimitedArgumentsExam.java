package chap06;

public class UnlimitedArgumentsExam {
    public static void main(String[] args) {
        System.out.println(sum(5, 10));
        System.out.println(sum(1, 2, 4, 2));
        System.out.println(sum(3, 1, 2, 3, 4, 1));
    }

    public static int sum(int... args) {
        System.out.println("print1 메서드 - args 길이 : " + args.length);
        int sum = 0;
        for (int i : args) {
            sum += i;
        }

        return sum;
    }
}
