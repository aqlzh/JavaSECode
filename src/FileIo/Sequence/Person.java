package FileIo.Sequence;

import java.io.Serializable;

public class Person  implements Serializable {

    // 防止序列号发生改变
    private static final long serialVersionUID = 1L;
    private String name;
    //private static int age;
    //private transient int age;
    public int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
