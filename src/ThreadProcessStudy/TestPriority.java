package ThreadProcessStudy;

public class TestPriority {
    public static void main(String[] args) {
        // 主线程默认优先级
        System.out.println(Thread.currentThread().getName()+"-->"+Thread.currentThread().getPriority());
        MyPriority myPrority = new MyPriority();

        Thread t1 = new Thread(myPrority);
        Thread t2 = new Thread(myPrority);
        Thread t3 = new Thread(myPrority);
        Thread t4 = new Thread(myPrority);

        t1.start();

        t2.setPriority(5);
        t2.start();

        t3.setPriority(Thread.MAX_PRIORITY);
        t3.start();

        t4.setPriority(4);
        t4.start();
    }
}
class MyPriority implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"-->"+Thread.currentThread().getPriority());
    }
}
