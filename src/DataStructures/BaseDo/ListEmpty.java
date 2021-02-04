package DataStructures.BaseDo;

public class ListEmpty {
    public static void main(String[] args) {
        int [] a = {0,0} ;
        int [] b ={3,5,7} ;
        int [] c ={} ;    // 判断数组为空的方法  长度为空

        System.out.println(fun(a));
        System.out.println(fun(b));
//        System.out.println(c.length);
        System.out.println(fun(c));
    }

    // 判断是否为空表函数
    public static Boolean fun(int [] arr){
        boolean flag = false ;
        for (int i = 0; i <arr.length ; i++) {


            if(arr[i] == 0){
                flag = true;
            }

        }
        if(arr.length == 0){
            flag = true;
        }
      return flag ;
    }
}
