package fill;


import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkHashSetTest {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("www");
        set.add("lzh");
        set.add("create");
        set.add("create");
        set.add("cn");
        System.out.println(set);

        System.out.println("===================");
        LinkedHashSet<String> linked = new LinkedHashSet<>() ;
        linked.add("www") ;
        linked.add("lzh") ;
        linked.add("lzh") ;
        linked.add("create") ;
        linked.add("cn") ;

        System.out.println(linked);;
    }


}
