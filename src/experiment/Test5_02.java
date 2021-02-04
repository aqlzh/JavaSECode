//package experiment;
//
//// 草稿
//public class Test5_02 {
//    public static void main(String[] args) {
//        int [] my_array = {1,2,5,5,7,2,9,2} ;
//        fun(my_array) ;
//
////        int [] q =  new int[my_array.length] ;
////           q = fun(my_array) ;
////        for (int i = 0; i <q.length ; i++) {
////            System.out.print(q[i] + " ");
////        }
//    }
//
//    public static  int [] fun(int [] my_array){
//
//        int [] res = new int [my_array.length]  ;
//        for (int i = 0; i <my_array.length ; i++) {
//            for (int j = i+1; j <my_array.length ; j++) {
//                if (my_array[i] == my_array[j]) {
//                    //System.out.print(my_array[i] + " " );
//
//                    int k = 0 ;
//                    res[k] = my_array[i] ;
//                    k++ ;
//                } else {
//                    break;
//                }
//            }
//        }
//        //res = fun(my_array) ;
//        for (int re : res) {
//            System.out.println(re + " ");
//        }
//        return  res ;
//    }
//}
