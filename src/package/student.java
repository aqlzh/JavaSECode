             // 类      private  私有
public class student {
                 // 封装一般对属性进行封装，方法也可，但一般不

                 // 属性私有
                 private String name;
                 private int id;
                 private char sex;
                 private int age;

                 public double money;


                 //但提供一些可以操作这个属性的方法
                 // 提供一些public 的get,set 方法

                 // get 获得这个数据
                 public String getName() {
                     return this.name;
                 }


                 // set 给这个数据设置值
                 public void setName(String name) {
                     this.name = name;

                 }

                 // 方法封装的应用
                 public int getAge() {
                     return age;
                 }

                 // 对其进行内部操作
                 public void setAge(int age) {
                     if (age > 120 || age < 0) {
                         this.age = 3;
                     } else {
                         this.age = age;
                     }

                 }
             }
