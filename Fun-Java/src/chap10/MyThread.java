package chap10;

// 1. Thread 클래스를 상속받는다.
public class MyThread extends Thread {

    private String str;

    public MyThread(String str) {
        this.str = str;
    }

    // 2. run() 메서드를 오버라이딩 한다.
    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        System.out.println("---" + name + "---");
        for (int i = 0; i < 10; i++) {
            System.out.print(str);
            try {
                Thread.sleep(1000); // 0.5초간 쉰다
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
        }
    }
}
