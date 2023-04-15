package chap10;

public class MyThreadExam2 {
    public static void main(String[] args) {
        String name = Thread.currentThread().getName();
        System.out.println("thread name : " + name);
        System.out.println("thread start!");

        MyRunnable myRunnable1 = new MyRunnable("*");
        MyRunnable myRunnable2 = new MyRunnable("+");

        // 3. Thread 인스턴스를 생성할 때, 생성자에 Runnable 인스턴스 넣기
        Thread thread1 = new Thread(myRunnable1);
        Thread thread2 = new Thread(myRunnable2);

        // 4. Thread가 가지고 있는 start() 메서드를 호출
        thread1.start();
        thread2.start();

        System.out.println("thread end!");
    }
}
