package experiment;

public class Test5_03 {
    public static void main(String[] args) {

        for (int counter = 0 ; counter <= 10 ; counter ++){
            System.out.println("fibonacci of "+ counter +"  is : "+fib(counter));
        }
    }
    public static  long fib(long number){
        if (number == 0 || number == 1) {
            return  number ;
        } else {
            return  fib(number - 1) + fib(number  -2) ;
        }

    }
}
