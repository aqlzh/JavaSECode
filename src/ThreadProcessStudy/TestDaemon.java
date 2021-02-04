package ThreadProcessStudy;

public class TestDaemon {
    public static void main(String[] args) {
        God god = new God();
        You you = new You();

        Thread thread = new Thread(god);
        thread.setDaemon(true);   // 默认false是用户线程，

        thread.start();  // 上帝守护线程启动

        new Thread(you).start();  //你线程启动
    }
}

//god
class God implements  Runnable{

    @Override
    public void run() {
        while(true){
            System.out.println("上帝保佑你");
        }
    }
}

// you
class You implements  Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("你开心得活着");
        }
        System.out.println("goodbye~world");
    }
}
