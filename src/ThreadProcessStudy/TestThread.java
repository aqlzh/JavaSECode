package ThreadProcessStudy;

public class TestThread extends Thread{

    // run 方法线程体
    public void  run(){
        for (int i = 0; i < 20; i++) {
            System.out.println("我在看代码"+i);
        }
    }
    public static void main(String[] args) {
       // main 线程 ,主线程

        // 创建一个线程对象
        TestThread test = new TestThread();
        // 开启线程
        test.start();
        for (int i = 0; i < 100; i++) {
            System.out.println("我在学习多线程"+i);
        }
    }
   //输出结果说明交替进行
}
