package fill;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class toStringTest {
    public static void main(String[] args) {
        Person p = new Person("张三",18);
        String s = p.toString();
        System.out.println(s);//com.itheima.demo01.Object.Person@75412c2f | abc | Person{name=张三 ,age=18}

        //直接打印对象的名字,其实就是调用对象的toString  p=p.toString();
        System.out.println(p);//com.itheima.demo01.Object.Person@5f150435 | abc | Person{name=张三 ,age=18}

        //看一个类是否重写了toString,直接打印这个类的对象即可,如果没有重写toString方法那么打印的是对象的地址值
        Random r = new Random();
        System.out.println(r);//java.util.Random@3f3afe78  没有重写toString方法

        Scanner sc = new Scanner(System.in);
        System.out.println(sc);//java.util.Scanner[delimiters=\p{javaWhitespace}+..  重写toString方法

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);//[1, 2, 3]  重写toString方法

        System.out.println("========");
        Integer i1 = 100;
        Integer i2 = 100;
        Integer i3 = 128;
        Integer i4 = 128;

        System.out.println(i1 == i2);   // ture
        System.out.println(i3 == i4);   //false

    }
}
