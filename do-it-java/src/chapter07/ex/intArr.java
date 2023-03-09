package chapter07.ex;

public class intArr {
    public static void main(String[] args) {
        int[] arr = new int[] {2, 4, 6, 8, 10};
        int sum = 0;

        for (int i = 0; i < 5; i++) {
            sum += arr[i];
        }

        System.out.println("1~10 중 짝수의 합 = " + sum);
    }
}
