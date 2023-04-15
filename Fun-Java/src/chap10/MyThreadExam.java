package chap10;

public class MyThreadExam {
    public static void main(String[] args) {
        String name = Thread.currentThread().getName();
        System.out.println("thread name : " + name);
        System.out.println("thread start!");

        MyThread myThread1 = new MyThread("*");
        MyThread myThread2 = new MyThread("+");

        myThread1.start();
        myThread2.start();

        System.out.println("thread end!");
    }
}
