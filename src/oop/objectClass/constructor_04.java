package oop.objectClass;

public class constructor_04 {
    // 一个类即使什么都不写，他也会存在一个方法
    // 显示定义的构造类

    String name ;

    // 实列化初始值
    // 1.使用new关键字，本质是调用构造器

    // 显化  无参构造
    public constructor_04() {
        this.name = "lzh";
    }

    // 有参构造      注意一旦定义了有参构造，无参就必须显示定义
    public  constructor_04(String name){
        this.name = name ;        // 前者name 为7行 String name  后者name为传进来name 18

    }


}
