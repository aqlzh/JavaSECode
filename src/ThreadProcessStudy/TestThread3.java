package ThreadProcessStudy;

// 注意死循环，以及多线程并发问题
public class TestThread3  implements Runnable{
   private int ticketnums = 10;
   @Override
   public void run() {
      boolean flag =false;
      while(! flag){

           if(ticketnums <= 0){
              break ;
           }
           try{
               Thread.sleep(200);
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
           System.out.println(Thread.currentThread().getName()+"-->抢到了第"+ticketnums +"票");
        }
   }

   public static void main(String[] args) {
      TestThread3 ticket = new TestThread3();
      new Thread(ticket,"小明").start();
      new Thread(ticket,"小花").start();
      new Thread(ticket,"小强").start();

   }
}
