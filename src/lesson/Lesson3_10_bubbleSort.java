package lesson;


// 数组作为参数  传递
public class Lesson3_10_bubbleSort {
    public static void main(String[] args) {
        int a [] = {4,2,5,8,1} ;

        for (int i = 0; i <=a.length-1 ; i++) {
            for (int j = 0; j <a.length-i-1 ; j++) {
                if(a[j]>a[j+1]){   //升序
                    int t = a[j] ;
                    a[j] = a[j+1] ;
                    a[j+1] = t ;
                }
            }
        }
        for (int i = 0; i <a.length ; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
