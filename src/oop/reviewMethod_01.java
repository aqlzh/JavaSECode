package oop;

//  reviewMethod_01  为类
public class reviewMethod_01 {
    // main  方法
    public static void main(String[] args) {
        int a =1 ;
        System.out.println(a);  //1

        reviewMethod_01.change(a);

        System.out.println(a);


    }
    /*
    修饰符  返回值类型  方法名（...）{
          方法体
          return 返回值
    }
     */
    public String sayHello(){
    return "sayHello" ;   // return 为语句的结束    return 的值与返回值类型相同
    }

    public static void change(int a){
        a=10 ;
    }

}
