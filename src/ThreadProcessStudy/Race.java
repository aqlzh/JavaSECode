//package ThreadProcessStudy;
//
//import static java.lang.Thread.currentThread;
//
//public class Race  implements Runnable{
//    private static String winner ;
//    private static boolean ture ;
//
//    // 模拟兔子休息
//  if(Thread.currentThread.getName().equals("兔子") && i%10==0){
//        try {
//            Thread.sleep(100);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//    }
//    @Override
//    public void run() {
//        for (int i = 0; i < 100; i++) {
//            boolean flag = GG(i);
//            if(flag){
//                break ;
//            }
//
//            System.out.println(Thread.currentThread().getName()="-->跑了"+i+"步");
//        }
//    }
//    // 判断是否完成比赛
//    private boolean GG(int steps){
//        if(winner != null){
//            return ture ;
//        }{
//            if(steps >= 100){
//                winner = Thread.currentThread().getName() ;
//                System.out.println("winner is"+winner);
//                return ture ;
//            }
//        }
//        return false ;
//    }
//
//    public static void main(String[] args) {
//        Race race = new Race();
//        new Thread(race,"兔子").start();
//        new Thread(race,"乌龟").start();
//    }
//}
