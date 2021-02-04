package exercise;

public class demo03 {
    public static void main(String[] args) {
        String license1 = "赣D" + randomUpperCaseChar() + (int)Math.round(Math.random()*10-1)+(int)Math.round(Math.random()*10-1);
        String license2 = "赣D" + randomUpperCaseChar() + (int)Math.round(Math.random()*10-1)+(int)Math.round(Math.random()*10-1);
        System.out.println(license1);
        if(license1 != license2){
            System.out.println(license2);
            int a = 10 ;
            int xbc = 10 ;

        }
    }

    public static char randomUpperCaseChar(){
        int i=(int)Math.round(Math.random()*26);
        int j=(int)'A'+i;
        char ch=(char)j;
        return ch ;
    }


}
