package DataStructures.BaseDo;

public class ListDelete {
    public  static long[] delete (long[] arr, int i){
        long [] arr1 = new long[arr.length-1] ;
//
//        for (int j = 0; j <i ; j++) {
//            arr1[j]= arr[j] ;
//        }
//        for (int j = i; j < arr1.length-1 ; j++) {
//              arr1[j] = arr1[j+1] ;
//        }

        for (int j = 0; j <arr1.length ; j++) {
            // 判断数组是否越界
            if(i<0 || i>arr1.length){
                throw  new RuntimeException("数组越界......") ;
            }
            if(j<i){
                arr1[j] = arr[j] ;
            }else {
                arr1[j]=arr[j+1] ;
            }
        }
        System.out.println("已删除"+arr[i]);
        return  arr1 ;
    }
    public static void main(String[] args) {
        long[] arr = {12, 25, 11, 36, 14};
        long[] arr1 = delete(arr, 0);
        for (long l : arr1) {
            System.out.print(l + " ");
        }
    }
}
