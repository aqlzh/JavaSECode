package experiment;

import java.util.Scanner;
// 16 ————> 10

// 注意：朴素代码实现
public class Test06_03 {
    public static void main(String[] args) {
        System.out.println("Please input number");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        System.out.print(Long.parseLong(string, 16));
    }
}
