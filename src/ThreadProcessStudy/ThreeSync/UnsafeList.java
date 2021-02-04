package ThreadProcessStudy.ThreeSync;

import java.util.ArrayList;
import java.util.List;

// 线程不齐全的集合，有可能两个线程同时操作一个数组，导致有一个被覆盖
public class UnsafeList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            new Thread(()->{
//                list.add(Thread.currentThread().getName());
                //解法
                synchronized (list){
                    list.add(Thread.currentThread().getName());
                }
            }).start();
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(list.size());
    }
}
