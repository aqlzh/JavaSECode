package base;

public class operator_05 {
    public static void main(String[] args) {

        // ctrl + D 复制当前行至下一行
        int a = 10 ;
        int b = 120 ;
        int c = 10 ;
        int d = 20 ;
        short e = 10 ;
        byte f = 8 ;

        System.out.println(a+b);
        System.out.println(c-b);
        System.out.println(c*d);
        System.out.println(c/d);
        System.out.println(c/(double)d);   //注意此于上者的区别

        System.out.println(e+f);  // 输出类型为  int


        System.out.println("______");
        // 自增 自减
        int num = 3 ;
        int num1= num++ ;  //3             // 执行完这段代码，先给num1赋值，在自增，相当于后面有以下代码
        // num = num + 1
        System.out.println(num);  // 4

        // num = num +1 ;   5
        int num2 = ++num ;   //  5

        System.out.println(num1);   //3
        System.out.println(num2);    //5

        System.out.println("________");
      //幂运算   方法
        double pow =Math.pow(2,3) ;
        System.out.println(pow);

        System.out.println("logical__________");
        //logical    逻辑运算符
        // &&   ||   ！
        //  短路运算
        int x = 5 ;
        boolean y = (c<4)&&(x++<4) ;
        System.out.println(y);
        System.out.println(x);

        //三元运算符
        //进入大厂 ？  月薪过万 ： 咸鱼一条
        

    }
}

