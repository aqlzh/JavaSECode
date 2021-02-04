package fill;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {
    public static void main(String[] args) {
        HashSet<Object> set = new HashSet<>();
        set.add("尽志无悔");
        set.add("深思慎取");
        set.add("尽志无悔");
// 使用迭代器遍历set集合
        Iterator<Object> it = set.iterator();
        while(it.hasNext()){
            Object n = it.next();
            System.out.println(n);
        }
        System.out.println("=============");
        // set.for   增强For循环
        for (Object o : set) {
            System.out.println(o);
        }
    }
}
