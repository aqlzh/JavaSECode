package ThreadProcessStudy;

public class DeadLock {
    public static void main(String[] args) {
        Makeup g1 = new Makeup(0,"灰姑娘");
        Makeup g2 = new Makeup(0,"白雪公主");

        g1.start();
        g2.start();

    }
}

class Lipstick{

}

class Mirror{

}

class Makeup extends Thread{
    static Lipstick  lipstick= new Lipstick();
    static Mirror mirror = new Mirror();

    int choice ;
    String girl ;

    public Makeup( int choice, String girl) {
        this.choice = choice;
        this.girl = girl;
    }

    @Override
    public void run(){
       // 化妆
        try {
            makeuo();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    // 化妆，互相持有对方的锁，级需要拿到对方的资源
    private void makeuo() throws InterruptedException {
        if(choice ==0){
            synchronized (lipstick){  // 获得口红的锁
                System.out.println(this.girl+"获得口红的锁");
                Thread.sleep(1000);

//                synchronized (mirror){  // 一秒后想获得镜子的锁
//                    System.out.println(this.girl+"获得镜子的锁");
//                        ****注意这样放在代码块里面就形成死锁
//                }
            }
            synchronized (mirror){  // 一秒后想获得镜子的锁
                System.out.println(this.girl+"获得镜子的锁");

            }
        }else{
            synchronized (mirror){  // 一秒后想获得镜子的锁
                System.out.println(this.girl+"获得镜子的锁");
                Thread.sleep(2000);
            }
            synchronized (lipstick){
                System.out.println(this.girl+"获得口红的锁");

            }
        }
    }
}
