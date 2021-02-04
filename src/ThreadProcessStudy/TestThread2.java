package ThreadProcessStudy;

public class TestThread2 implements  Runnable{
    @Override
    public void run() {
        // run 方法线程体
        for (int i = 0; i < 200; i++) {
            System.out.println("我在看代码"+i);
        }

    }

    public static void main(String[] args) {
        for (int i = 0; i < 200; i++) {
            System.out.println("我在学习多线程"+i);
        }
        // 创建runnable 接口的实现类对象
        TestThread2 test = new TestThread2();
        // 创建线程对象，通过线程对象来开启我们的线程
//        Thread thread = new Thread(test);
//        thread.start();
        // 简写
        new Thread(test).start();



    }
}
