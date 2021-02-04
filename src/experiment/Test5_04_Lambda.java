package experiment;

public class Test5_04_Lambda {
    interface  MathOperation{
        int operation (int a,int b) ;


    }
    private  int operate(int a,int b,MathOperation mathOperation){
        return mathOperation.operation(a,b) ;
    }

    public static void main(String[] args) {
        Test5_04_Lambda test = new Test5_04_Lambda() ;

        //  类型声明
        MathOperation addition = (int a,int b) -> a+b ;

        // 不用类型声明
        MathOperation subtraction = (a,b) -> a-b ;

        // 大括号中使用  return  语句
        MathOperation multiplication = (int a,int b) -> {return a*b ;} ;

        // 没有大括号以及 return  语句
        System.out.println("10+4=" + test.operate(10,4,addition));
        System.out.println("10-4=" + test.operate(10,4,subtraction));
        System.out.println("10*4=" + test.operate(10,4,multiplication));
    }
}
