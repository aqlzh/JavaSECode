package experiment;

// 插入排序
public class Test06_04 {
    public static void main(String[] args) {
        insertionSort();
    }
    public  static  void insertionSort(){
        int [] a = {10,4,2,0,2,8} ;
        int k ;
        for (int i = 0; i <a.length ; i++) {
            int temp = a[i] ;
            for ( k = i; k > 0 && temp < a[k-1]; k--) {
                a[k] = a[k-1] ;
            }
            a[k] = temp ;
        }
        for (int i = 0; i <a.length ; i++) {
            System.out.print(a[i] +  " ");
        }
    }
}
