package DataStructures;

import DataStructures.BaseDo.GetElem;
import DataStructures.BaseDo.LocateElem;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

//   错误
public class P20_UnionSetNew {



    public static void main(String[] args) {
        int [] a = {3,4,5,6} ;
        int [] b = {3,4,6,7,8,9} ;
        Collection set = new ArrayList();
        for (int i = 0; i <b.length ; i++) {
            int t1 = GetElem.Elem(b, i);
//            System.out.println(t1);
            int t2 = LocateElem.compare(a, t1);

            set.add(t2);
        }
        Iterator<Integer> it = set.iterator() ;
        while(it.hasNext()){
            int s =  it.next() ;
            System.out.print(s);
        }
    }

}
