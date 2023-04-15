package chap08;

public class Exception01 {
    public static void main(String[] args) {
        ExceptionObj1 exobj = new ExceptionObj1();
        try {
            int value = exobj.divide(10, 0);
            System.out.println(value);
        } catch (ArithmeticException e) {
            System.out.println("0으로 나눌 수 없습니다.");
        }
    }
}

class ExceptionObj1 {
    /**
     * i를 k로 나눈 나머지를 반환한다.
     * @param i
     * @param k
     * @return
     * @throws ArithmeticException
     */
    public int divide(int i, int k) throws ArithmeticException {
        int value = 0;
        value = i / k;
        return value;
    }
}
