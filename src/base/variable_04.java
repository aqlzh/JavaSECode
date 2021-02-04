package base;

public class variable_04 {
    // 属性： 变量

    // 类变量  static
    static double salary = 35000 ;

    // 实列变量 ： 从属于对象  如果不自动初始化  则此类型的默认值  0
    //  布尔值的默认值为 false
    // 除了基本类型 其余都为 null

    String name ;
    int age ;    /* 定义于方法之外 public static void main(String[] args)
                 属于 类 public class variable {
                  */

    // main  方法
    public static void main(String[] args) {

        int a=1 , b=2 ,c=3 ;   // 局部变量   必须声明和初始化值  具有一定的生命周期
        String name = "LZH.create" ;
        char x = 'X' ;
        double pi = 3.14 ;


         // 实列变量调用方法

        // 变量类型 变量名字 = new variable()
        variable_04 variable = new variable_04() ;
        System.out.println(variable.name);
        System.out.println(variable.age);


        // 类变量调用
        System.out.println(salary);

        }
    // 其他方法
    public void add(){
        System.out.println("");
    }
}
