package fill;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapTest {
    public static void main(String[] args) {
        // 创建Map集合对象
        HashMap<String, String> map = new HashMap<String,String>();
        // 添加元素到集合
        map.put("胡歌", "霍建华");
        map.put("郭德纲", "于谦");
        map.put("薛之谦", "大张伟");

        // 获取 所有的 entry对象  entrySet
        Set<Map.Entry<String,String>> entrySet = map.entrySet();   //*

        // 遍历得到每一个entry对象
        for (Map.Entry<String, String> entry : entrySet) {
            // 解析
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+"的CP是:"+value);
        }
        //使用迭代器
//        Iterator<Map.Entry<String,Integer>> it = set.iterator();
//        whlie(it.hasNext()){
//            Map.Entry<String,Integger> entry = it.next() ;
//            //解析
//            String key = entry.getKey() ;
//            Integer value = entry.getValue() ;
//            System.]out.println(key+"="+value) ;
//        }
//
//    }
//}
    }
}
