public class application {

    //1.提高程序的安全性，保护数据
    // 2.隐藏代码的实现细节
    // 3.统一接口
    // 4.增加系统的可维护性

    public static void main(String[] args) {
        final student s1 = new student();   //?
        s1.money=1.0 ;
//        s1.String ="" ;      报红因为私有

        String name = s1.getName();

        s1.setName("LZH");
        System.out.println(s1.getName());

        s1.setAge(12)  ;  // 不合法
        System.out.println(s1.getAge());

    }
}
