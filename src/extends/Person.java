package extend;
//父类
// 在java 中所有类都直接或间接继承 Object 
public class Person {
    //修饰符
    // public  protected  default  private


    public Person() {

        System.out.println("Person 无参执行");
    }

    public int money = 10_0000;

    public void say() {
        System.out.println("说了一句话");

        // super
//       protected  String name = "qiange" ;

//        public void print(){
//            System.out.println("Person");
//        }
    }


    protected void print() {
        System.out.println("Person");
    }
}
