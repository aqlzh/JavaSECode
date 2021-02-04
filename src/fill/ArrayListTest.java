package fill;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        // 添加元素
        list.add("小泉花阳");
        list.add("黑泽露比");
        list.add("高海千歌");
        System.out.println(list);
        //遍历元素
        for (int i = 0; i <list.size() ; i++) {
            System.out.println(list.get(i));
        }
        //获取元素
        String name = list.get(2);
        System.out.println("第3个元素为"+name);
        //删除元素
        String whoRemoved = list.remove(3);
        System.out.println("删除的是"+whoRemoved);
        System.out.println(list);

    }
}
