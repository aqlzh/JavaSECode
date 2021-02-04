package experiment;

import java.util.Scanner;

// 实现判断对称字符串
public class Test06_01 {

    public static void main(String[] args) {
        System.out.println("Please input String ");
        Scanner  sc = new Scanner(System.in) ;
        String str = sc.next() ;

        if( function(str) == true){
            System.out.println(str + "  is symmetric string");
        } else {
            System.out.println(str + "  not is symmetric string");
        }

    }

    public  static  boolean function (String s){
        if( s == null){
            return  false  ;
        }

        if( s.equals("") || s.length() == 1){
            return  true ;
        }

        for (int i = 0; i <s.length()/2  ; i++) {
            if(s.charAt(i) != s.charAt(s.length() -i-1)){
                return  false ;
            }
        }

        return  true ;
    }
}
