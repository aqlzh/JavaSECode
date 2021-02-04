package ThreadProcessStudy;

import java.util.concurrent.locks.ReentrantLock;

public class TestLock {
    public static void main(String[] args) {
        TestLock2 testLock2 = new TestLock2();

        // 模拟三个线程同时操作一个对象
        new Thread(testLock2).start();
        new Thread(testLock2).start();
        new Thread(testLock2).start();
    }
}

class TestLock2 implements  Runnable{

    int ticketNums = 10;
    //定义锁
    private final ReentrantLock lock = new ReentrantLock();
    @Override
    public void run() {
        while(true){
            try {
                lock.lock();

                if(ticketNums >= 0) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName()+"拿到"+ticketNums--);   //注意分割符的位置
                }else{
                    break ;
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                // 解所
                lock.unlock();
            }

        }
    }
}
