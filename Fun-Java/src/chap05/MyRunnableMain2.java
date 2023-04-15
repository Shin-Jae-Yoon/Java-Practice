package chap05;

public class MyRunnableMain2 {
    public static void main(String[] args) {
        // 버전 1
//        MyRunnable myRunnable = new MyRunnable() {
//            @Override
//            public void run() {
//                System.out.println("hello!!!");
//            }
//        };
//
//        RunnableExecute runnableExecute = new RunnableExecute();
//        System.out.println("----------");
//        runnableExecute.execute(myRunnable);
//        System.out.println("----------");

        // 버전 2
//        RunnableExecute runnableExecute = new RunnableExecute();
//        System.out.println("----------");
//        runnableExecute.execute(new MyRunnable() {
//            @Override
//            public void run() {
//                System.out.println("hello!!!");
//            }
//        });
//        System.out.println("----------");
        // 재사용할 일이 없다고 생각하면 이렇게 이름없는 객체를 사용할 수도 있음


        RunnableExecute runnableExecute = new RunnableExecute();
        System.out.println("----------");
        runnableExecute.execute(() -> {
            System.out.println("hello!!!");
        });
        System.out.println("----------");
    }
}
