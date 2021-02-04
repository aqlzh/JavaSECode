package extends2;

public class applaction {
    public static void main(String[] args) {

        //  方法的调用只和左边定义的数据类型有关
        A a = new A();
        a.test() ;

        // 父类的引用指向子类
        B b = new A();
        b.test() ;
    }

}
