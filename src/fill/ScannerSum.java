package fill;

import java.util.Scanner;

public class ScannerSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;

        System.out.println("这是一个比较三个数大小的程序");
        System.out.println("请输入第一个数");
        int a = sc.nextInt() ;
        System.out.println("请输入第二个数");
        int b = sc.nextInt() ;
        System.out.println("请输入第三个数");
        int c = sc.nextInt() ;

        int temp = a>b ? a : b ;
        int max = c >temp ? c:temp ;
        System.out.println("比较结果"+max);
    }
}
