package base;

import java.util.Scanner;

public class Struct_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;

        System.out.println("请输入内容");
        String s = scanner.nextLine() ;

        // equals 判断字符串是否相等
        if(s.equals("Hello")){
            System.out.println(s);
        }else{
            System.out.println("End");
        }

        scanner.close();


        System.out.println("______");
        // switch  语句

         char grade  = 'A' ;
//        String grade = "B" ;

        switch(grade){
            case 'A' :
                System.out.println("优秀");
                break ;    // 一定要加break 否则会出现case穿透
            case 'B' :
                System.out.println("良好");
                break;
            case 'C' :
                System.out.println("及格");
                break ;    // 一定要加break 否则会出现case穿透
            case 'D' :
                System.out.println("挂科");
                break;
            default:
                System.out.println("异常");

        }
        // for循环练习   用for 输出1~1000之间能被5整除的数

        for (int i = 0; i < 1000; i++) {
            if(i%5==0){
                System.out.print(i+"\t");
            }
            if(i%(5*3)==0)   //控制换行
                System.out.println();
            // 或这样    System.out.print("\n);
        }


    }
}

