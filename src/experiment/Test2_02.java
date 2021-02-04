package experiment;

public class Test2_02 {
    public static final double PI = 3.1415926 ;

    public static char randomUpperCaseChar(){
        int i=(int)Math.round(Math.random()*26);
//        System.out.println(i);
        int j=(int)'A'+i;

//        System.out.println((int)'A');g34
        char ch=(char)j;
        System.out.println(ch);
          return ch ;
    }

    public static double sqrt(double a){
        double error = 1e-5 ;
        double root0 = 1.0 ;
        double root1 = 1.0/2*(root0+a/root0) ;
        while(Math.abs(root1-root0)>=error) {
            root0 = root1 ;
            root1 = 1.0/2*(root0+a/root0) ;
        }
        return root1 ;
    }



    public static double cos(int degree){
        double x = Math.PI/180*degree ;
        double result = 1.0 ;
        int flag = -1 ;
        for (int i = 2; i <=20 ; i=i+2) {
            result = result + flag *
                      Math.pow(x,i)/factorial(i) ;
            flag = flag *(-1) ;
         }
        return  result ;
    }

    public static int factorial(int num){
        int result = 1 ;
        for (int i = 1; i < num ; i++) {
            result = result * i;
        }
        return  result ;
    }


    public static void main(String[] args) {
        System.out.println(Test2_02.cos(60));
        System.out.println(Test2_02.sqrt(4));
    }
}
