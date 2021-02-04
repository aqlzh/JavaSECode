package fill;

import java.util.Scanner;

public class Anonymous_02 {
    public static void main(String[] args) {
        // 常规Scanner使用
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入数字");
//        int num = sc.nextInt();
//        System.out.println("输入的数字是"+num);
        // 匿名对象
//        int num = new Scanner(System.in).nextInt();
//       System.out.println("输入的数字是"+num);


      //常规写法传参
//        Scanner sc = new Scanner(System.in);
//        methodParam(sc);
        //匿名传参
//        methodParam(new Scanner(System.in));


        // 匿名对象作为返回值
        Scanner sc = methodReturn();
        int num = sc.nextInt() ;
        System.out.println("输入的是"+num);

    }

    public static void methodParam(Scanner sc){
        int num = sc.nextInt();
        System.out.println("输入的数字是"+num);
    }

    public static Scanner methodReturn(){
        // 常规
//        Scanner sc = new Scanner(System.in);
//        return  sc ;

        // 匿名对象作为返回值
        return  new Scanner(System.in) ;
    }

}
