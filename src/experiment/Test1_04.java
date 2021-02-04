package experiment;

import java.util.Scanner;

import static java.lang.StrictMath.sqrt;

public class Test1_04 {
    public static void main(String[] args) {
        System.out.println("please input three nums");
        Scanner scanner = new Scanner(System.in) ;

            int a = scanner.nextInt() ;
            int b = scanner.nextInt() ;
            int c = scanner.nextInt() ;

            double x = b*b-4*a*c ;

          if(x<0){
              System.out.println("无解");
          } else{
              double x1 = ((-b+sqrt(x))/(2*a)) ;
              double x2 = ((-b-sqrt(x))/(2*a)) ;
              System.out.println(x1);
              System.out.println(x2);
          }




    }
}
