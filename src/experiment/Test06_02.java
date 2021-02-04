package experiment;

import java.util.Scanner;

// 清除非数字字符
public class Test06_02 {
    public static void main(String[] args) {
        System.out.println("please input String ");
        Scanner sc =new Scanner(System.in);
       // String s=new String();
        String s=sc.nextLine();
        for(int index=0;index<s.length()-1;index++)
        {
            if(s.charAt(index)>=48 && s.charAt(index)<=57)
            {
                System.out.print(s.charAt(index));
            }

        }
    }
}
