package lesson;

import java.util.Scanner;

public class Lesson2_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;
        System.out.println("请输入两个数");
        int a = input.nextInt() ;
        int b = input.nextInt() ;

        for (int i = Math.min(a,b); i > 0; i--) {
            if(a%i ==0 && b%i==0){
                System.out.println("最大公因数为"+i);
                break ;

            }
        }
    }
}
