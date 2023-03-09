package chapter04;

public class pr07_forExample {
    public static void main(String[] args) {
        // 초기화식 생략
        int i = 0;
        for ( ; i < 5; i++) {
            System.out.println("초기화식 생략 예제 " + "반복횟수 = " + i);
        }

        // 조건식 생략
        int j;
        int sum = 0;
        for ( j = 0; ; j++ ) {
            sum += j;
            System.out.println("조건식 생략 예제 더하는 중, 반복횟수 = " + j);
            if (sum > 200) break;
        }
        System.out.println("조건식 생략 예제 끝난 후 합 = " + sum);

        // 증감식 생략
        for (int k = 0; k < 5; ) {
            k = (++k) % 10;
            System.out.println(k);
        }

        // 요소 모두 생략
        // for ( ; ; ) {
        //       무한루프 입니다.
        // }
    }
}
