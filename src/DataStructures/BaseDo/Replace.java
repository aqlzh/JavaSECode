package DataStructures.BaseDo;


// 取代数组中元素算法
public class Replace {
    public static void main(String[] args) {
        int [] a = {1,2,3,4} ;
        int [] b= fun(a,2,0) ;
        for (int i : b) {
            System.out.print(i+ " ");
        }

        }
    public static int[] fun(int[] arr,int i,int num){      // 分函数写在主函数外
        int [] arr1 = new int[arr.length] ;
        for (int j = 0; j <arr.length ; j++) {
            arr1[j] = arr[j] ;
            arr1[i] = num ;
        }
        return arr1;

    }

    }

