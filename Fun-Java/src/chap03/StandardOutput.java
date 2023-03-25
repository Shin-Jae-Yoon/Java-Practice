package chap03;

public class StandardOutput {
    public void println(boolean b) {
        System.out.println(b);
    }

    public void println(int i) {
        System.out.println(i);
    }

    public void println(double d) {
        System.out.println(d);
    }

    public void println(String s) {
        System.out.println(s);
    }

    public static void main(String[] args) {
        StandardOutput standardOutput = new StandardOutput();
        standardOutput.println(100);
        standardOutput.println("hello");
        standardOutput.println(10.5);
        standardOutput.println(false);
    }
}
