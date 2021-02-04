package fill;

public class StringBuilderTest {
    public static void main(String[] args) {
        //创建StringBuilder对象
        StringBuilder bu = new StringBuilder();
        //使用append方法往StringBuilder中添加数据
        //append方法返回的是this,调用方法的对象bu,this==bu
        StringBuilder bu2 = bu.append("abc");//把bu的地址赋值给了bu2
        System.out.println(bu);//"abc"
        System.out.println(bu2);//"abc"
        System.out.println(bu==bu2);//比较的是地址 true

        //使用append方法无需接收返回值, 链式编程:方法返回值是一个对象,可以继续调用方法
        bu.append("abc");
        bu.append(1);
        bu.append('好');

    }
}
