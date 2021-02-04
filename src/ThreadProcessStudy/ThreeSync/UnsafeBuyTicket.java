package ThreadProcessStudy.ThreeSync;

// 情景多人去抢票，有人抢到-1
public class UnsafeBuyTicket {
    public static void main(String[] args) {
     BuyTicket station =  new BuyTicket();
     new Thread(station,"小明").start();
     new Thread(station,"小花").start();
     new Thread(station,"小西").start();
    }
}

class BuyTicket implements Runnable{

     private  int ticketNums =10;
     boolean flag = true ;
    @Override
    public void run() {

        // 买票
       while(flag){
           try {
               Thread.sleep(1000);
               buy();
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
       }

    }

    private /*synchronized*/  void buy() throws InterruptedException {             //解法
        if(ticketNums <=0){
            flag = false;
            return;
        }
        // 延迟
//        Thread.sleep(1000);     sleep不会释放锁
        System.out.println(Thread.currentThread().getName()+"拿到"+ticketNums--);
    }
}
