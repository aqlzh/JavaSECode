package base;

import java.util.Arrays ;

public class arrayAdvanceTwo_13 {
    public static void main(String[] args) {

        // //二维数组
        int[][] array = {{1,2},{2,3},{3,4},{4,4}} ;

        System.out.println(array[0][1]);

        printArray(array[0]);
        System.out.println(" ");
        System.out.println(array[0]);


        System.out.println("_______");
        int[] a ={1,34,5,2,67,3,45,89,23} ;

        // 打印数组元素方法
        System.out.println(Arrays.toString(a));

        System.out.println("_________");
        // //升序
        Arrays.sort(a) ;
        System.out.println(Arrays.toString(a));

        System.out.println("__________");
        // //填充
        Arrays.fill(a,2,4,0);
        System.out.println(Arrays.toString(a));


        System.out.println("___________");
        // //冒泡排序
        int[] sort = sort(a) ;
        System.out.println(Arrays.toString(sort));



    }

   public static int[] sort(int[] a){
        int temp = 0 ;
       // 冒泡排序  两个for循环 外层冒泡数  里层依次比较
       for (int i = 0; i <a.length ; i++) {
           // 内层循环判断两个数
           for (int j = 0; j <a.length-1 ; j++) {
               if(a[j+1] < a[j]){
                   temp = a[j] ;
                   a[j] = a[j+1] ;
                   a[j+1] = temp ;
                }
           }
       }
       return a ;
   }



    public static void printArray(int[] arrays){
        for (int i = 0; i <arrays.length ; i++) {
            System.out.print(arrays[i]);
        }
    }
}
