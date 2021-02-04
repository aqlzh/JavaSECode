package base;

public class array_11 {
    public static void main(String[] args) {

        // 变量的类型  变量的名字 = 变量的值
        int[] nums ; //声明数组
       // int nums2[] ; // 声明数组

       nums = new int[10] ;
       nums[0]=3 ;
        System.out.println(nums[0]);


        System.out.println("____层级______");


        //// 数组的使用

        int[] arrays = {1,2,3,4} ; //静态初始化

        // 打印全部数组元素
        for (int i = 0; i < arrays.length; i++) {
            System.out.println(arrays[i]);
        }

        System.out.println("______");

        // 打印元素和
        int sum =0 ;
        for (int i = 0; i <arrays.length ; i++) {
            sum+= arrays[i] ;
        }
        System.out.println("sum:"+sum);

        System.out.println("______");

        // 查找最大元素
        int max =arrays[0] ;

        for (int i = 1; i <arrays.length ; i++) {
            if(arrays[i]>max){
                max=arrays[i] ;
            }
        }
        System.out.println("最大值max为"+max);
    }

}
