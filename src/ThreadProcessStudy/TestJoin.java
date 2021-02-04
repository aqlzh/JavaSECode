package ThreadProcessStudy;
// 输出结果为交替的原因好像式多核cpu
public class TestJoin implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("线程vip"+i);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        // 启动线程
        TestJoin test = new TestJoin();
        Thread thread = new Thread(test);
        thread.start();

        // 主线程
        for (int i = 0; i < 1000; i++) {
            if(i==300){
                thread.join();   // 线程vip插队
            }
            System.out.println("main"+i);
        }
    }

}
