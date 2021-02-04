package DataStructures;

import DataStructures.BaseDo.GetElem;
import DataStructures.BaseDo.LocateElem;

// 错误
public class P20_UnionSet {

    public static void main(String[] args) {
      int [] a2 ={1,1,1,1,1,1,1,1,1} ;

      int [] a = {3,4,5,6} ;
      int [] b = {3,4,6,7,8,9} ;


      // 增长 a数组
      int[] a1 = new int[a.length+b.length] ;

        for (int i = 0; i <a.length ; i++) {
            a1[i] =a[i] ;
        }

        for (int i = 0; i <b.length ; i++) {
//            System.out.print(GetElem.Elem(b,i) ) ;
            int  t1 = GetElem.Elem(b,i) ;
           // System.out.println(t1);
            int t2 = LocateElem.compare(a,t1) ;


          if(t2==0){
              int t= a1.length ;
               if(t>a1.length){
                   throw  new RuntimeException("数组越界......") ;
//                   a2=  ListInsert.insert(a1,++t,t1) ;
               }

          }

            }

        for (int i : a2) {
            System.out.print(i+"");
        }

        }



    }

