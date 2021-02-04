package lesson;


import java.util.Random;

// 运用java实现自动出题系统
public class Lesson2_01 {
//   A  65  --- a  97
    public static void main(String[] args) {

        System.out.println("这是一个自动出题");
        System.out.println("Size"+Byte.SIZE/8);
        Random r1 = new Random() ;
//        Random r2 = new Math.random() ;

        double  r2 = Math.random() ;

       int r3 = (int)(Math.random()) ;
        System.out.println(r3);
        System.out.println(r2);
        System.out.println(r1);
    }
}
