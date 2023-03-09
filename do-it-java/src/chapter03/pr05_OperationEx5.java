package chapter03;

public class pr05_OperationEx5 {
    public static void main(String[] args) {
        int num = 0B00000101;   // 5를 8비트 2진수로 나타냄
        System.out.println(num << 2);   // 왼쪽으로 2비트 이동 00010100 (20)
        System.out.println(num >> 2);   // 오른쪽으로 2비트 이동 00000001 (1)
        System.out.println(num >>> 2);  // 오른쪽으로 2비트 이동 00000001 (1)

        System.out.println(num);    // 값 대입 안했으니까 그대로 5

        num = num << 2;
        System.out.println(num);  // 왼쪽으로 2비트 이동했으니까 20
    }
}
