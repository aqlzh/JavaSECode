package DataStructures.BaseDo;

public class DestoryList {

    // 主函数测试
    public static void main(String[] args) {
        int [] arr ={2,4,7,6} ;
       int [] result= delete(arr) ;
        System.out.println(result);    // 数组的地址
        for (int i = 0; i <result.length ; i++) {
            System.out.println(result[i]);
        }

    }

    public static  int[]  delete(int [] arr){
        for (int i = 0; i <arr.length ; i++) {
            arr[i] = 0 ;
        }
        return arr ;
    }
}
