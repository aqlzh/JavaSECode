package oop.objectClass;

//   一个项目中因该只有一个方法
public class Application_02 {
    public static void main(String[] args) {
        // 类  抽象的   实例化
        // 类实列化后会返回一个自己的对象
        // 以下第二个单词（student）就是一个Student 类的具体实列

//        Student student = new Student() ;
//        Student xiaoming  = new Student() ;
//        Student xiaohong = new Student() ;    // 由于第一个单词报错
          // 原因与类名相同    第二个单词  对象名可以不同

        classAndObject_03 student = new  classAndObject_03() ;
        classAndObject_03 xiaoming  = new  classAndObject_03() ;
        classAndObject_03 xiaohong = new  classAndObject_03() ;

        xiaoming.name ="小明" ;
        xiaoming.age = 3 ;

        System.out.println(xiaoming.name);
        System.out.println(xiaoming.age);

        System.out.println(xiaohong.name);



        //   constructor_04 部分·
        constructor_04 constructor_04 = new constructor_04();
        System.out.println(constructor_04.name);


    }
}
