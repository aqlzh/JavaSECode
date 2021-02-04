package exercise;

public class demo02 {
    public static void main(String[] args) {
        int [] a = new int[90] ;
        for (int k =0 ; k <90 ;k++){
            int i = 0 ;
            a[i] = k;
            i++ ;
        }
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
