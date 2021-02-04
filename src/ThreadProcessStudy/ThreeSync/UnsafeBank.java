package ThreadProcessStudy.ThreeSync;

public class UnsafeBank {
    public static void main(String[] args) {
       Account account = new Account(100,"结婚基金");

        Drawing you1 = new Drawing(account,50,"you1");
        Drawing you2 = new Drawing(account,100,"you2");

        you1.start();
        you2.start();
    }
}
class Drawing extends Thread{
    Account account ;
    int drawingMoney ;
    int nowMoney;

    public Drawing( Account account ,int drawingMoney,String name){
        super(name);
        this.account = account;
        this.drawingMoney = drawingMoney;

    }
    @Override
    public  void run(){

// 解法运用代码块，锁的是变化的量，需要增删改查，而如果直接在方法中则是this
       synchronized (account){
           if(account.money-drawingMoney<0){
               System.out.println(Thread.currentThread().getName()+"钱不够");
               return;
           }
           // sleep可以放大问题
           try {
               Thread.sleep(1000);
           } catch (InterruptedException e) {
               e.printStackTrace();
           }

           account.money = account.money - drawingMoney;
           nowMoney = nowMoney + drawingMoney;
           System.out.println(account.name+"余额为"+account.money);
           System.out.println(this.getName()+"手里得钱"+nowMoney);
       }


    }


}
// 账户
 class Account {
    int money ; // 余额
    String name ;

    public Account(int money, String name) {
        this.money = money;
        this.name = name;
    }


}
