package ThreadProcessStudy;

public class TestStop implements Runnable{

    // 设置一个标识位
    private boolean ture;
    private boolean flag = ture ;

    @Override
    public void run() {
       int i = 0;
       while(flag){
           System.out.println("run...Thread"+i++);
       }
    }
    //2.设置一个公开的方法停止线程
    public void stop(){
        this.flag =false ;
    }
    public static void main(String[] args) {
        TestStop testStop = new TestStop();
        new Thread(testStop).start();

        for (int i = 0; i < 1000; i++) {
            System.out.println("main"+i);
            if(i==900){
                // 调用stop方法切换标志符，让线程停止
                testStop.stop();
                System.out.println("线程该停止了");
            }
        }
    }
}
