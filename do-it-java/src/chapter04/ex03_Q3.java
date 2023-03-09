package chapter04;

public class ex03_Q3 {
    public static void main(String[] args) {
        int dan, times;

        // 내가 짠 코드
        // for (dan = 1; dan <= 9; dan++) {
        //     for (times = 1; times <= dan; times++) {
        //         System.out.println(dan + " X " + times + " = " + (dan * times));
        //     }
        //     System.out.println();
        // }

        // 정답 코드
        for (dan = 1; dan <= 9; dan++) {
            for (times = 1; times <= 9; times++) {
                if (dan < times) break;
                System.out.println(dan + " X " + times + " = " + (dan * times));
            }
            System.out.println();
        }
    }
}
