package DataStructures;

import java.util.Scanner;

public class Test01_02 {
    public static void main(String[] args) {
        double sum0,sum=1;
        System.out.println("please input x,n");
        Scanner scaner = new Scanner(System.in) ;
        double x = scaner.nextDouble()  ;
        int n = scaner.nextInt() ;

        for (int i = 0; i < n; i++) {

            sum0 = 1 ;
            sum = 1 ;
            for (int j = 0; j < i; j++) {
                sum0=-sum0/x ;
                sum+= sum0 ;
            }
        }

        System.out.println(sum);

    }
}
