package chapter04;

public class ex02_Q2 {
    public static void main(String[] args) {
        int dan, times;

        // 내가 짠 코드
        // for (dan = 1; dan <= 9; dan++) {
        //     for (times = 1; times <= 9; times++) {
        //         if (dan % 2 == 0) {
        //             System.out.println(dan + " X " + times + " = " + (dan * times));
        //         }
        //     }
        //     System.out.println();
        // }

        // 정답 코드
        for (dan = 1; dan <= 9; dan++) {
            if (dan % 2 != 0) continue;
            for (times = 1; times <= 9; times++) {
                System.out.println(dan + " X " + times + " = " + (dan * times));
            }
            System.out.println();
        }
    }
}
