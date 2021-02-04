package base;

public class typeCast_03 {
    public static void main(String[] args) {


        //    低 ------------->  高
        //   byte,short,char -> int -> long -> float -> double

        int i =128 ;
        byte b = (byte)i ; // 内存溢出    // 强制转换
        double c = i ;   // 自动转换
        // 强制转换   （类型）变量名   高 - 低
        // 直动转换   低 - 高
        System.out.println(i);
        System.out.println(b);
        System.out.println(c);

        System.out.println("______");

        // 例子2
        char d = 'a' ;
        int e =d+1  ;  // 自动转换   低 - 高
        System.out.println(e);
        System.out.println((int)e);  //  强制转换

        int money = 10_0000_0000 ;  // jdk7 新特性
        int years = 20 ;
        int total = money*years ;    // 数据溢出
        long  total2 =  money*years ;  // 默认int 在转换之前已存在问题
        // 正解
        long total3 = money*((long)years)  ;
        System.out.println(total);
        System.out.println(total2);
        System.out.println(total3);


        System.out.println("-----------------");
        int n= 6 ;
        String s =  Integer.toBinaryString(n) ;
        int x = Integer.parseInt(s) ;
//        int y = Integer.parseInt(s) ;
        System.out.println(s);
    }
}
