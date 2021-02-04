package experiment;

import java.util.Scanner;

public class Test1_01 {
    public static void main(String[] args) {
        System.out.println("please input number");

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        String s = Integer.toBinaryString(num);
        String x = Integer.toHexString(num);
        System.out.println(s);
        System.out.println(x);
    }
}
