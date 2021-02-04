package base;

import java.net.StandardSocketOptions;

public class dataType_02 {
    public static void main(String[] args) {    //psvm

        // 八大数据类型

//     Integer
        int num1 = 10 ;
        byte num2 = 20 ;
        short num3 = 30 ;
        long num4 =30L ;

        float num5 = 50.1F ;
        double num6 = 3.14 ;

        char name = 'A' ;
//        boolean flag = ture ;
        System.out.println(num1);           //sout
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
        System.out.println(num5);
        System.out.println(num6);           //sout
        System.out.println(name);
//        System.out.println(flag);

        System.out.println("__________");
        // 整数拓展

        // 进制
        int i1= 10 ;
        int i2 =010 ;   // 八进制
        int i3 =0x10 ; // 十六进制

        // 浮点数拓展  关于银行存款问题   float double     -》   使用类   BigDecimal

        //****   最好完全避免使用丰谷点数进行数据的比较  原因 有限  离散 舍人 大约但不等于

        float f =0.1f  ;
        double d = 1.0/10 ;
        System.out.println(f==d);


       float d1 = 36723712982f ;   // 注意最后的 f
       float d2 = d1 + 1 ;
        System.out.println(d1==d2);

     // 字符拓展
        System.out.println("_______");
     char c1 = 'a' ;
     char c2 = '鸿' ;

        System.out.println(c1);
        // 字符强制转换
        System.out.println((int)c1);

        System.out.println(c2);
        System.out.println((int)c2);
       // 说明所有字符本质上还是数
        // 编码  Unicode  表（97=a   65=A）2字节  0~65536   2^16 = 65536 (Excel最初最大容量 )

        // U0000~ UFFFF
        char c3 = '\u0061' ;
        System.out.println(c3);   //a

    }
}
