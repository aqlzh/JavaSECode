package experiment;

import java.util.Scanner;

public class Test1_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;
        System.out.println("剪刀石头布游戏");
        System.out.println("请出拳 0.石头  1.剪刀  2.布");

        int user = input.nextInt() ;
        int computer = (int) (Math.random()) ;

        if(user == computer){
            System.out.println("电脑"+computer);
            System.out.println("用户"+user);
            System.out.println("双方平局");
        } else if(user ==0 && computer ==1 ||
                user ==1 && computer ==2  ||
                user ==2 && computer ==0
        ){
            System.out.println("电脑"+computer);
            System.out.println("用户"+user);
            System.out.println("用户胜利");
        } else{
            System.out.println("电脑"+computer);
            System.out.println("用户"+user);
            System.out.println("电脑胜利");
        }
    }
}
