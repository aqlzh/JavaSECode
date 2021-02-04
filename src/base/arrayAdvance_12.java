package base;

public class arrayAdvance_12 {
    public static void main(String[] args) {
      int[] arrays= {1,2,3,4,5} ;

      // for  each 循环
        for (int array : arrays) {    // 后者为数组名   前者为数组中每一个元素（个人理解）
            System.out.println(arrays);  // 地址
            System.out.println(array);   //元素的值   注意没有下标

        }
        System.out.println("__________");

        // 翻转数组

//        for (int i = arrays.length; i >0 ; i--) {
//
//            int[] newArrays= new int[arrays.length] ;
//            newArrays[] = arrays[i] ;
//        }              为什么报错

        int[] reverse = reverse(arrays) ;
        printArray(reverse) ;

    }

    public static int[] reverse(int[] arrays){
        int[] result = new int[arrays.length] ;
        for (int i = 0,j=result.length-1 ; i <arrays.length ; i++,j--) {
             result[j] = arrays[i] ;
        }
        return result ;
    }





    // 打印数组元素方法
    public static void printArray(int[] arrays){
        for (int i = 0; i <arrays.length ; i++) {
            System.out.print(arrays[i]);
        }
    }

}
