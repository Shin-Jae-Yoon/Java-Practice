package chap10;

// 1. Runnable 인터페이스 구현
public class MyRunnable implements Runnable {

    private String str;

    public MyRunnable(String str) {
        this.str = str;
    }

    // 2. run() 메서드 오버라이딩
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
