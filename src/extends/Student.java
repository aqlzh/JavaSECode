package extend;

public class Student extends extend.Person {

    public Student() {
        // 隐藏代码   调用了父类的无参构造
        super() ;  // 第一
        System.out.println("无参执行力");
    }

    private String name = "小柑橘" ;

    public Student(String lisi, int i) {

    }

    public void test(String name){
          System.out.println(name);  //高海千歌
          System.out.println(this.name);  //小柑橘
//          System.out.println(super.name);
          System.out.println("_____");
      }

      public void print(){
          System.out.println("Student");
      }

      public void test1(){
          print();
          this.print() ;
          super.print() ;
      }


}
