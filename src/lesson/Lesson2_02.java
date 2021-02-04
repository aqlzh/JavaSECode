package lesson;


// 验证运算顺序
public class Lesson2_02 {
    public static void main(String[] args) {
//       int a = 3 ;
//       int b = 2+ a++ ;


       int a = 3 ;
       int b = 2+ ++ a ;

        System.out.println(b);
        System.out.println(a);
    }
}
