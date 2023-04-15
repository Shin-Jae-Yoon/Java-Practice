package chap08;

public class Exception04 {
    public static void main(String[] args) {
        try {
            Exception05 exboj = new Exception05();
            int value = exboj.divide(10, 0);
            System.out.println(value);
        } catch (MyException e) {
            System.out.println("사용자 정의 Exception이 발생했네요.");
        }
    }
}

class Exception05 {
    public int divide(int i, int k) throws MyException {
        int value = 0;
        try {
            value = i / k;
        } catch (ArithmeticException ae) {
            throw new MyException("0으로 나눌 수 없슴");
        }
        return value;
    }
}
