package chap02;

public class MathBeanMain {
    public static void main(String[] args) {
        MathBean mathBean = new MathBean();
        mathBean.printClassName();
        mathBean.printNumber(1);

        int result1 = mathBean.getOne();
        int result2 = mathBean.plus(2, 5);

        System.out.println(result1);
        System.out.println(result2);
    }
}
