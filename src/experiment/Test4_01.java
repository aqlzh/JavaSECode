package experiment;

public class Test4_01 {

        public static  int[] fun(int [] list1,int [] list2) {

//                int[] list3 = new int[9];
//
//                for (int i = 0; i < list1.length; i++) {
//                        for (int j = 0; j < list2.length; j++) {
//                                if (list1[i] < list2[j]) {
//                                        for (int k = 0; k <list3.length ; k++) {
//                                                list3[k] =list1[i] ;
//                                        }
//
//                                } else {
//
//                                        for (int k = 0; k <list3.length ; k++) {
//                                                list3[k] =list1[j] ;
//                                        }
//                                }
//                        }
//
//                }
//                return list3;
                  int index1 = 0;
                  int index2 = 0;
                  int k =0;
                int[] res = new int[list1.length+list2.length];
                //使用while循环遍历；当indexM或者indexN中有任意一个值为M或者N时，则表示当前某一个数组遍历到尾部
                while(index1<list1.length&&index2<list2.length){
                        if (list1[index1]<=list2[index2]){
                                res[k]=list1[index1];
                                index1++;
                        }else{
                                res[k]=list2[index2];
                                index2++;
                        }
                        k++;
                }
                // 判断哪一个数组被遍历到尾部，则此处将另一个数组添加到汇总数组中即可；
                // 此时 a =indexM，并a++,将M数组中剩余值添加到res中；
                if(index1!=list1.length){
                        for(int a = index1 ;a<list1.length;a++){
                                res[k]=list1[a];
                                k++;
                        }
                }else{
                        // 此时 a =indexM，并a++,将M数组中剩余值添加到res中；
                        for(int a = index2 ;a<list2.length;a++){
                                res[k]=list2[a];
                                k++;
                        }
                }
//                for(int a =0;a<k;a++){
//                        System.out.println(res[a]);
//                }
                return  res ;
        }

        public static void main(String[] args) {
                int [] list1 = {1,3,6,7,9} ;
                int [] list2 = {8,10,12,20} ;
                // int [] list3 = {} ;
               int [] result  =   fun(list1,list2) ;
                for (int i : result) {
                        System.out.print(i+" ");
                }
        }


}
