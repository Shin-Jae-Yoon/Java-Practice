package chap02;

public class MathBean {

    public MathBean() {};

    public void printClassName() {
        System.out.println(getClass().getName());
    }

    public void printNumber(int x) {
        System.out.println(x);
    }

    public int getOne() {
        return 1;
    }

    public int plus(int x, int y) {
        return x + y;
    }
}
