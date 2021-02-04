package experiment;

public class Test1_2 {
        //  定义判断素数的函数
    public static boolean isPrime(int num) {
        for(int i = 2; i <= Math.sqrt(num); i++) { //程序默认2是素数，当j=2时，循环不执行
            if(num % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        for(int j = 2; j <= 1000; j++) {
            if(Test1_2.isPrime(j)) {   //  御用主类调用函数
                System.out.println(j + " is a prime");
            }
        }
    }

}
